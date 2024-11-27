package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.ProductPicture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductPictureMapper {
    List<ProductPicture> select(ProductPicture picture);
}