package com.prodemy.springbootjpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prodemy.springbootjpa.dto.CostDto;
import com.prodemy.springbootjpa.dto.ProvinceData;
import com.prodemy.springbootjpa.dto.ProvinceDto;

@Service
public class RestClientService {
    
    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getProvinceString(){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "be55b8455ba114707c3dce1842b469ba");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<String> respon = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        return respon;
    }

    public ProvinceDto getProvinceObject(){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "be55b8455ba114707c3dce1842b469ba");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<ProvinceDto> provinceDto = restTemplate.exchange(url, HttpMethod.GET, entity, ProvinceDto.class);
        // System.out.println(provinceDto.getBody());
        return provinceDto.getBody();
    }

    public ProvinceData getProvinceObjectById(int id){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "be55b8455ba114707c3dce1842b469ba");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<ProvinceDto> provinceDto = restTemplate.exchange(url, HttpMethod.GET, entity, ProvinceDto.class);
        return provinceDto.getBody().getRajaongkir().getResults().get(id - 1);
    }

    public List<ProvinceData> getProvinceObjectByName(String name){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "be55b8455ba114707c3dce1842b469ba");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<ProvinceDto> provinceDto = restTemplate.exchange(url, HttpMethod.GET, entity, ProvinceDto.class);

        List<ProvinceData> result = new ArrayList<>();
        List<ProvinceData> provinces = provinceDto.getBody().getRajaongkir().getResults();
        for (ProvinceData provinceData : provinces) {
            // System.out.println(provinceData.getProvince());
            if (provinceData.getProvince().toLowerCase().contains(name)) {
                result.add(provinceData);
            }
        }
        // System.out.println(result);
        return result;
    }

    public ResponseEntity<String> getCostString(){
        //URL
        String url = "https://api.rajaongkir.com/starter/cost";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "be55b8455ba114707c3dce1842b469ba");
        header.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        //Body
        String requestBody = "origin=501&destination=114&weight=1700&courier=jne";

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(requestBody, header);

        ResponseEntity<String> respon = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        return respon;
    }

    public CostDto getCostObject(){
        String url = "https://api.rajaongkir.com/starter/cost";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("key", "be55b8455ba114707c3dce1842b469ba");
        String requestBody = "origin=501&destination=114&weight=1700&courier=jne";
        // CostQuery costQuery = new CostQuery();
        // costQuery.setOrigin("501");
        // costQuery.setDestination("114");
        // costQuery.setWeight(1700);
        // costQuery.setCourier("jne");

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<CostDto> respon = restTemplate.exchange(url, HttpMethod.POST, entity, CostDto.class);
        return respon.getBody();
    }
}