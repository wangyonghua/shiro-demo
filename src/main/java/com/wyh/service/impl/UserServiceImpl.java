package com.wyh.service.impl;

import com.wyh.dao.UserRepository;
import com.wyh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;
    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}