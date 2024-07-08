package com.springmicroservice.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {

    // good practice to separate model entities and DTOs
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
