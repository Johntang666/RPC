package com.tang.rpc.controller;

import com.tang.rpc.anno.RpcReference;
import com.tang.rpc.api.IUserService;
import com.tang.rpc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RpcReference
    IUserService userService;

    @RequestMapping("/getUserById")
    public User getUserById(int id){
        return userService.getById(id);
    }
//http://localhost:8081/user/getUserById/
}