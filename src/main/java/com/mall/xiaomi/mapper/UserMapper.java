package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectOne(User user);

    Integer selectCount(User user);

    void insert(User user);
}