package com.github.qjerry.client;

import com.github.qjerry.ApiResponse;

/**
 * @author Jerry
 * @date 2022/8/3
 */
public interface UserApi {

    /**
     * 获取用户昵称
     * @param userId
     * @return
     */
    ApiResponse<String> getUserName(String userId);
}
