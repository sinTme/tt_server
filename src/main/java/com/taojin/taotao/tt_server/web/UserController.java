package com.taojin.taotao.tt_server.web;

import com.taojin.taotao.tt_server.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User login()
    {
        redisTemplate.opsForValue().set("name","qqq");
        User user = new User();
        user.setUserName((String) redisTemplate.opsForValue().get("name"));
        user.setUserPassword("123");
        user.setUserPhoneNumber("11111");
        return user;
    }
}
