package com.cm.service;

import com.cm.entity.User;

public interface UserService {
    User getUser(String username);
    int addUser(User user);
}
