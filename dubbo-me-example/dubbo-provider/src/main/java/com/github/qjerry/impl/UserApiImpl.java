package com.github.qjerry.impl;

import com.github.qjerry.ApiResponse;
import com.github.qjerry.client.UserApi;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Jerry
 * @date 2022/8/3
 */
@DubboService
public class UserApiImpl implements UserApi {

    @Override
    public ApiResponse<String> getUserName(String userId) {
        return ApiResponse.success("Jerry");
    }
}
