package com.ssmcrud.service;

import com.ssmcrud.bean.news;
import com.ssmcrud.bean.user;
import com.ssmcrud.dao.newsMapper;
import com.ssmcrud.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private newsMapper newsmapper;

    public List<news> getAllNews(){
        List<news> list = newsmapper.getAllNews();
        return list;
    }
}
