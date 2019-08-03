package com.wyh.service;

import com.wyh.dmo.User;
import com.wyh.dto.LoginResult;

public interface UserService {
    User findByUserName(String userName);
}

