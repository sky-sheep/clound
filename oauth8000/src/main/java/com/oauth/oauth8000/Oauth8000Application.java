package com.oauth.oauth8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用oauth 2 实现认证中心 登陆统一管理
 * 分为授权码模式和密码模式
 * 授权码模式：token放入内存中，通过登陆后返回的授权码（code）请求http://localhost:8000/oauth/token换取token，使用token请求接口
 * 密码模式：加入redis，将token放入redis中。 通过密码的方式换取token，请求访问http://localhost:8000/oauth/token
 * 刷新token：http://localhost:8000/oauth/token    grant_type改为refresh_token  参数为refresh_token：要刷新的token
 */
@SpringBootApplication
public class Oauth8000Application {

    public static void main(String[] args) {
        SpringApplication.run(Oauth8000Application.class, args);
    }

}
