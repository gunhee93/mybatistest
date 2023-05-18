package com.example.hellomybatis.mapper;

import com.example.hellomybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUserList();

    User updateUser();
}
