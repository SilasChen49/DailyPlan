package com.cm.test;

import com.cm.entity.User;
import com.cm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends UserDaoTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        for (int i=0; i<5; i++){
            User user = new User();
            String j = i+"okay1111";
            user.setUsername(j);
            user.setPassword(j);
            user.setNickname(j);
            user.setGender(j);
            user.setEmail(j);
            user.setDescription(j);
            user.setPoints(i);
            userService.addUser(user);
        }
    }

    @Test
    public void getUser(){
        User user = userService.getUser("1okay");
        System.out.println(user);
    }
}
