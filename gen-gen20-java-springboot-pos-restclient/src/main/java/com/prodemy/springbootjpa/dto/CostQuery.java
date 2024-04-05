package com.prodemy.springbootjpa.dto;

import lombok.Data;

@Data
public class CostQuery {
    private String origin;
    private String destination;
    private Integer weight;
    private String courier;
}