package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper{

    List<Integer> selectIds();

    List<Product> selectProductByName(String productName);

    Product selectByPrimaryKey(Integer productId);

    void updateByPrimaryKey(Product product);

    List<Product> selectByExample(Integer categoryId);

    List<Product> selectAll();

    List<Product> select(Product product);

    List<Product> selectByDesc();
}