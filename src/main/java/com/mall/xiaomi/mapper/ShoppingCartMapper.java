package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    List<ShoppingCart> select(ShoppingCart cart);

    ShoppingCart selectOne(ShoppingCart shoppingCart);

    void updateByPrimaryKey(ShoppingCart one);

    void insert(ShoppingCart cart);

    Integer delete(ShoppingCart cart);

    int updateByPrimaryKeySelective(ShoppingCart cart);
}