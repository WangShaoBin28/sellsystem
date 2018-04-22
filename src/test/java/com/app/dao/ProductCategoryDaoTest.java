package com.app.dao;

import com.app.model.ProductCategory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryDaoTest {

    private Logger logger= LoggerFactory.getLogger(ProductCategoryDaoTest.class);

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findAll(){
        List<ProductCategory> list = productCategoryDao.findAll();
        log.info(list.toString());
    }

    @Test
    public void save(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("洗衣用品");
        productCategory.setCategoryType(1);
        productCategory.setCreateDate(new Date());
        productCategory.setUpdateData(new Date());

        ProductCategory category = productCategoryDao.save(productCategory);

    }

}