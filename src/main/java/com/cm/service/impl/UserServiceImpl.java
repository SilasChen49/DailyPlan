package com.cm.service.impl;

import com.cm.dao.UserDao;
import com.cm.entity.User;
import com.cm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User getUser(String username) {
        return userDao.queryByUsername(username);
    }
}
