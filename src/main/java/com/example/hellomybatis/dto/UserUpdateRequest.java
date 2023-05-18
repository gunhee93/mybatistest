package com.example.hellomybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class UserUpdateRequest {

    private String nickname;
    private String name;
    private String gender;

    public UserUpdateRequest(String nickname, String name, String gender) {
        this.nickname = nickname;
        this.name = name;
        this.gender = gender;
    }
}
