package com.mall.xiaomi.pojo;

import lombok.Data;

@Data
public class Product {

    private Integer productId;

    private String productName;

    private Integer categoryId;

    private String productTitle;

    private String productPicture;

    private Double productPrice;

    private Double productSellingPrice;

    private Integer productNum;

    private Integer productSales;

    private String productIntro;

}