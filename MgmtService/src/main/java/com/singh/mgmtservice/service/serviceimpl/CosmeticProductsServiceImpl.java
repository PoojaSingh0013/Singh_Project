package com.singh.mgmtservice.service.serviceimpl;

import com.singh.mgmtservice.dto.CosmeticProductsDto;
import com.singh.mgmtservice.entity.CosmeticProducts;
import com.singh.mgmtservice.repository.CosmeticProductsRepository;
import com.singh.mgmtservice.service.CosmeticProductsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CosmeticProductsServiceImpl implements CosmeticProductsService {

    @Autowired
    CosmeticProductsRepository cosmeticProductsRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public CosmeticProductsDto setProducts(CosmeticProductsDto cosmeticProductsDto) {
       CosmeticProducts cosmeticProducts= modelMapper.map(cosmeticProductsDto, CosmeticProducts.class);
       // CosmeticProductsDto cosmeticProductsDto1=modelMapper.map(cosmeticProducts,CosmeticProductsDto.class);
        return modelMapper.map(cosmeticProductsRepository.save(cosmeticProducts),CosmeticProductsDto.class);
    }

    @Override
    public CosmeticProducts saveDetailsForProduct(CosmeticProducts product) {
        return cosmeticProductsRepository.save(product);
    }
}
