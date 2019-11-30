package com.pd.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pd.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //添加用户
    //url路径
    @RequestMapping(value = "register")
    String register(@RequestParam("user_name") String user_name, @RequestParam("user_scores") int user_scores,
                    @RequestParam("user_subject") String user_subject) {
        return userService.register(user_name, user_scores, user_subject);
    }
}
