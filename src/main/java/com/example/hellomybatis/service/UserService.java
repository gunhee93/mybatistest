package com.example.hellomybatis.service;

import com.example.hellomybatis.domain.User;
import com.example.hellomybatis.dto.UserUpdateRequest;
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

    public void updateUser(UserUpdateRequest userUpdateRequest) {
        User.builder().nickname(userUpdateRequest.getNickname())
                .name(userUpdateRequest.getName())
                .gender(userUpdateRequest.getGender())
                .build();
        userMapper.updateUser();
    }
}
