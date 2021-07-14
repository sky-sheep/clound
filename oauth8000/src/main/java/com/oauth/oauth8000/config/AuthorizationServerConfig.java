package com.oauth.oauth8000.config;

import com.oauth.oauth8000.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * 认证服务器配置
 * @author ylx
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    @Qualifier("redisTokenStore")
    private TokenStore tokenStore;

    //密码模式
    private static final String PASSWORD = "password";
    //授权码模式
    private static final String CODE = "authorization_code";
    //刷新token
    private static final String REFRESHTOKEN = "refresh_token";


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("admin")    //配置client_id
                .secret(passwordEncoder.encode("admin123456"))  //配置client_secret
                .accessTokenValiditySeconds(3600)   //配置访问token的有效期
                .refreshTokenValiditySeconds(864000)    //配置刷新token的有效期
                .redirectUris("http://www.baidu.com")   //配置redirect_uri,用于授权成功后跳转
                .scopes("all")  //配置申请的权限范围
                .authorizedGrantTypes(CODE,PASSWORD,REFRESHTOKEN); //配置grant_type，表示授权类型
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager)
                .userDetailsService(userService)
                .tokenStore(tokenStore);
    }
}
