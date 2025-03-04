package com.singh.mgmtservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CosmeticProductsDto implements Serializable {

    private Long id;


    private String product_name;


    private BigDecimal price;  // ✅ Changed from String to BigDecimal


    private String category;


    private String brand;
}
