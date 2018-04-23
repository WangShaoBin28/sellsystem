package com.app.dao;

import com.app.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 商品类目管理service
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer>{



}
