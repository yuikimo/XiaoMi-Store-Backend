package com.mall.xiaomi.pojo;

import lombok.Data;
import java.io.Serializable;

@Data
public class SeckillProduct implements Serializable {

    private Integer seckillId;

    private Integer productId;

    private Double seckillPrice;

    private Integer seckillStock;

    private Integer timeId;
}
