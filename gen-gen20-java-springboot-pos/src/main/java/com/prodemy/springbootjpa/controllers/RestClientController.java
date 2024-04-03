package com.prodemy.springbootjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.springbootjpa.dto.CostDto;
import com.prodemy.springbootjpa.dto.ProvinceData;
import com.prodemy.springbootjpa.dto.ProvinceDto;
import com.prodemy.springbootjpa.services.RestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/data")
public class RestClientController {
    
    @Autowired
    private RestClientService restClientService;

    // @GetMapping("/province")
    @Scheduled(cron = "*/30 * * * * *")
    public ResponseEntity<String> getProvinceStr() {
        System.out.println(restClientService);
        return restClientService.getProvinceString();
    }

    @GetMapping("/object/province")
    public ProvinceDto getProvinceObj() {
        return restClientService.getProvinceObject();
    }

    @GetMapping("/object/province/{id}")
    public ProvinceData getProvinceObjById(@PathVariable int id) {
        return restClientService.getProvinceObjectById(id);
    }

    @GetMapping("/object/province/name/{name}")
    public List<ProvinceData> getProvinceObjByName(@PathVariable String name) {
        return restClientService.getProvinceObjectByName(name);
    }

    @PostMapping("/cost")
    public ResponseEntity<String> getCostStr() {
        return restClientService.getCostString();
    }

    @PostMapping("/object/cost")
    public CostDto getCostObj() {
        return restClientService.getCostObject();
    }
}