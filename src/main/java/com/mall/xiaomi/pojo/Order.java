package com.mall.xiaomi.pojo;

import lombok.Data;

@Data
public class Order {

    private Integer id;

    private String orderId;

    private Integer userId;

    private Integer productId;

    private Integer productNum;

    private Double productPrice;

    private Long orderTime;

}