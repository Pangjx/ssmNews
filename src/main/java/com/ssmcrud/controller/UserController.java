package com.ssmcrud.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmcrud.bean.*;
import com.ssmcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author pjx
 *
 * User表的controller定义
 */
@Controller
public class UserController {
    @Autowired
    private UserService UserService;

    /*返回所有部门信息*/
    @RequestMapping("/allUser")
    @ResponseBody
    public Msg selectAllUser(){
        List<user> list = (List<user>) UserService.getUsers();
        return Msg.success().add("depts",list);
    }


}
