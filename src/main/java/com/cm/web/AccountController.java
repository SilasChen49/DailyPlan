package com.cm.web;

import com.cm.entity.User;
import com.cm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Controller
public class AccountController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    private String index(){
        return "index";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    private String signIn(Model model, @RequestParam("username") String username, @RequestParam("password") String password){
        boolean verification=false;
        //verify  the userid and password.
        User user = userService.getUser(username);
        if (user!=null && user.getPassword().equals(password))
            verification = true;
        if (verification)
            return "plan";
        else
            return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    private String signUp(Model model){
        return "signUp";
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    private String signUp(Model model, @ModelAttribute User user){
        user.setPoints(0);
        userService.addUser(user);
        return "plan";
    }

    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    private String plan(Model model){
        return "plan";
    }

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    private String account(Model model){
        return "account";
    }

    @RequestMapping(value = "/shopping", method = RequestMethod.GET)
    private String shopping(Model model){
        return "shopping";
    }
}
