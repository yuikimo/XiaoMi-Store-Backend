package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.SeckillProduct;
import com.mall.xiaomi.vo.SeckillProductVo;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface SeckillProductMapper {

    List<SeckillProductVo> getSeckillProductVos(@Param("timeID") String timeId, @Param("time") Long time);

    SeckillProductVo getSeckill(String seckillId);

    void decrStock(Integer seckillId);

    void deleteAll();

    SeckillProduct selectOne(SeckillProduct seckillProduct);

    void insert(SeckillProduct seckillProduct);

    void insertList(ArrayList<SeckillProduct> seckillProducts);
}
