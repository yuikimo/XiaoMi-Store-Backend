package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.Order;
import com.mall.xiaomi.vo.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<OrderVo> getOrderVoByUserId(Integer userId);

    void insert(Order order);
}