package com.nacos.client7001.elasticsearch.service;

import com.nacos.client7001.elasticsearch.pojo.User;

import java.util.List;

/**
 * @author ylx
 */
public interface UserService {

    /** 统计数据 */
    Long count();

    User save(User user);

    Iterable<User> getAll();
}
