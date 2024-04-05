package com.prodemy.springbootjpa.dto;

import java.util.List;

import lombok.Data;

@Data
public class CostData {
    private String code;
    private String name;
    private List<Costs> costs;
}