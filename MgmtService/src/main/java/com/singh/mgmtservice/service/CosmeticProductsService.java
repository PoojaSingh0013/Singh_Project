package com.singh.mgmtservice.service;

import com.singh.mgmtservice.dto.CosmeticProductsDto;
import com.singh.mgmtservice.entity.CosmeticProducts;
import com.singh.mgmtservice.repository.CosmeticProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CosmeticProductsService {
    CosmeticProductsDto setProducts(CosmeticProductsDto cosmeticProductsDto);
    CosmeticProducts saveDetailsForProduct(CosmeticProducts product);

}

