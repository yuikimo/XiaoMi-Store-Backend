package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> selectAll();
}