package com.akshay.nearbysense.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class PlaceResponseDto {
    private String keyword;
    private List<PlaceResultDto> results;
}
