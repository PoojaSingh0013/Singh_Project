package com.singh.mgmtservice.repository;

import com.singh.mgmtservice.entity.CosmeticProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CosmeticProductsRepository extends JpaRepository<CosmeticProducts,Long> {

}
