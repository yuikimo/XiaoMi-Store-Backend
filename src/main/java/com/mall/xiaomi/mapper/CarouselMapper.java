package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarouselMapper {

    List<Carousel> selectAll();
}