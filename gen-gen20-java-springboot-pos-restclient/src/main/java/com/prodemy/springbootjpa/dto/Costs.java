package com.prodemy.springbootjpa.dto;

import java.util.List;

import lombok.Data;

@Data
public class Costs {
    private String service;
    private String description;
    private List<Cost> cost;
}
