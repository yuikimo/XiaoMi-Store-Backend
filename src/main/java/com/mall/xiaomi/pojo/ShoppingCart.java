package com.mall.xiaomi.pojo;

import lombok.Data;

@Data
public class ShoppingCart {

    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer num;
}