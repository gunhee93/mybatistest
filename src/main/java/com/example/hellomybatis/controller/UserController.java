package com.example.hellomybatis.controller;

import com.example.hellomybatis.domain.User;
import com.example.hellomybatis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/getuser")
    public ResponseEntity<List<User>> getUserList() {
        List<User> userList = userService.getUserList();

        return new ResponseEntity<>(userList, HttpStatus.OK);

    }
}
