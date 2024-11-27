package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.Collect;
import com.mall.xiaomi.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectMapper {

    List<Product> getCollect(String userId);

    int delete(Collect collect);

    Collect selectOne(Collect collect);

    int insert(Collect collect);
}