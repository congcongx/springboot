package com.xie.mapper;

import com.xie.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User selUserById(@Param(value = "userId")Integer userId);
}
