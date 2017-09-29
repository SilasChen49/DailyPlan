package com.cm.dao;


import com.cm.entity.User;

public interface UserDao {
    User queryByUsername(String username);
    int insertUser(User user);
}
