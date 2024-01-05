package com.example.demo.dto;

import java.math.BigDecimal;

public record Shoes(
        Long id,
        String title,
        String image,
        BigDecimal price
) {

}
