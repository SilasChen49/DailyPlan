package com.hisen.test;

import com.cm.dao.UserDao;
import com.cm.entity.User;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

//    @Test
//    public void addUser(){
//        for (int i=0; i<5; i++){
//            User user = new User();
//            String j = i+"okay1";
//            user.setUsername(j);
//            user.setPassword(j);
//            user.setNickname(j);
//            user.setGender(j);
//            user.setEmail(j);
//            user.setDescription(j);
//            user.setPoints(i);
//            int x = userDao.insertUser(user);
//            System.out.println(x);
//        }
//    }

    @Test
    public void getUser(){
        User user = userDao.queryByUsername("1okay");
        System.out.println(user);
    }
}
