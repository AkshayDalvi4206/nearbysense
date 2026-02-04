package com.akshay.nearbysense.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaceResultDto {
    private String name;
    private String address;
    private Double rating;
}
