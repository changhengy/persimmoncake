package org.persimmon.cake.controller;
/*
 * @time 2021/5/20 10:10
 * @author chy
 */

import org.persimmon.cake.model.RespBean;
import org.persimmon.cake.model.User;
import org.persimmon.cake.service.PostgresConService;
import org.persimmon.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DemoAddUserController {
//    @Autowired
//    UserService userService;
    @Autowired
    PostgresConService postgresConService;

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }

    @GetMapping("/adduser")
//    public RespBean addUser(@RequestBody User user)  {
    public RespBean addUser() throws IOException {
        postgresConService.dbInit();

//        if (userService.addSalary(user) == 1) {
//            return RespBean.ok("添加成功!");
//        }
        return RespBean.error("添加失败!");
    }

}
