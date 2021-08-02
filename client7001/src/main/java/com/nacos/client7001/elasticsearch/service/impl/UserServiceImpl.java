package com.nacos.client7001.elasticsearch.service.impl;

import com.nacos.client7001.elasticsearch.pojo.User;
import com.nacos.client7001.elasticsearch.service.UserRepository;
import com.nacos.client7001.elasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Long count() {
        return userRepository.count();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
