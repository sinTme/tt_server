package com.taojin.taotao.tt_server.web;

import com.taojin.taotao.tt_server.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User login()
    {
        User user = new User();
        user.setUserName("admin");
        user.setUserPassword("123");
        user.setUserPhoneNumber("11111");
        return user;
    }
}
