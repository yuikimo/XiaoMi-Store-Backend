package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.SeckillTime;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SeckillTimeMapper {

    SeckillTime selectOne(SeckillTime seckillTime);

    void insert(SeckillTime seckillTime);

    List<SeckillTime> getTime(long time);

    void deleteAll();

    Long getEndTime(Integer timeId);
}
