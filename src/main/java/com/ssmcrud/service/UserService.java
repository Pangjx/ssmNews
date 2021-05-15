package com.ssmcrud.service;

import com.ssmcrud.bean.user;
import com.ssmcrud.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private userMapper usermapper;

    public List<user> getUsers(){
        List<user> list = usermapper.selectAllUser();
        return list;
    }
}
