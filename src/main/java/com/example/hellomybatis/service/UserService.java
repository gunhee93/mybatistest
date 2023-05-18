package com.example.hellomybatis.service;

import com.example.hellomybatis.domain.User;
import com.example.hellomybatis.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
