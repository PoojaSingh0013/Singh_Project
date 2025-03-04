package com.singh.mgmtservice.controller;

import com.singh.mgmtservice.dto.CosmeticProductsDto;
import com.singh.mgmtservice.entity.CosmeticProducts;
import com.singh.mgmtservice.service.CosmeticProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mgmt")
public class CosmeticProductsController {

    @Autowired
    CosmeticProductsService cosmeticProductsService;

    @PostMapping(value = "/save", produces = "application/json")
    public ResponseEntity<CosmeticProductsDto> saveProducts(@RequestBody CosmeticProductsDto cosmeticProductsDto) {
        return new ResponseEntity<>(cosmeticProductsService.setProducts(cosmeticProductsDto), HttpStatus.CREATED);
    }

    @PostMapping(value = "/save-details")
    public ResponseEntity<CosmeticProducts> saveProductDetails(@RequestBody CosmeticProducts cosmeticProductsDto) {
        return new ResponseEntity<>(cosmeticProductsService.saveDetailsForProduct(cosmeticProductsDto), HttpStatus.CREATED);
    }

}
