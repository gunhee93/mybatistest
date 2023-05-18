package com.example.hellomybatis.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class User {

    private String nickname;
    private String name;
    private String gender;

    @Builder
    public User(String nickname, String name, String gender) {
        this.nickname = nickname;
        this.name = name;
        this.gender = gender;
    }
}
