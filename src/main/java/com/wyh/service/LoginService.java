package com.wyh.service;

import com.wyh.dto.LoginResult;

public interface LoginService {
    LoginResult login(String userName, String password);
    void logout();
}