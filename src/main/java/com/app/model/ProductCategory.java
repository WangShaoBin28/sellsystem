package com.app.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 类目表
 */
@Table(name = "product_category")
@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String categoryName;

    private Integer categoryType;

    private Date createDate;

    private Date updateData;

}
