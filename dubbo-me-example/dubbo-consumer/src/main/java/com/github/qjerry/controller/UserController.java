package com.github.qjerry.controller;

import com.github.qjerry.ApiResponse;
import com.github.qjerry.client.UserApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @date 2022/8/3
 */
@RestController
public class UserController {

    @DubboReference
    private UserApi userApi;

    @GetMapping("/user/get/{uid}")
    public ApiResponse<String> getUserName(@PathVariable("uid") String uid) {
        return userApi.getUserName(uid);
    }
}
