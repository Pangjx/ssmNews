package com.ssmcrud.service;

import com.ssmcrud.bean.*;
import com.ssmcrud.bean.news;
import com.ssmcrud.dao.newsMapper;
import com.ssmcrud.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class NewsService {

    @Autowired
    private newsMapper newsmapper;

    public List<news> getAllNews(){
        List<news> list = newsmapper.getAllNews();
        return list;
    }
//
//    /**
//     * 查询所有新闻
//     * @return
//     */
//    public List<news> getAll() {
//        // TODO Auto-generated method stub
//        return newsMapper.selectByExampleWithDept(null);
//    }
//
    /**
     * 新闻保存
     * @param news
     */
    public void savenews(news news) throws ParseException {
        // TODO Auto-generated method stub
        System.out.println("调用插入函数");
        newsmapper.insertSelective(news);
    }

    /**
     * 检验用户名是否可用
     *
     * @param newsName
     * @return  true：代表当前姓名可用   fasle：不可用
     */
    public boolean checkUser(String newsName) {
        // TODO Auto-generated method stub
        newsExample example = new newsExample();
        newsExample.Criteria criteria = example.createCriteria();
        criteria.andNewstitleEqualTo(newsName);
        long count = newsmapper.countByExample(example);
        return count == 0;
    }

    /**
     * 新闻删除
     * @param id
     */
    public void  deleteBatch(List<Integer> ids) {
        // TODO Auto-generated method stub
        newsExample example = new newsExample();
        newsExample.Criteria criteria = example.createCriteria();
        //delete from xxx where emp_id in(1,2,3)
        criteria.andNewsidIn(ids);
        newsmapper.deleteByExample(example);
    }

    public void deletenews(Integer id) {
        newsmapper.deleteByPrimaryKey(id);
    }

    /**
     * 按照新闻id查询新闻
     * @param id
     * @return
     */
    public news getnews(Integer id) {
        // TODO Auto-generated method stub
        news news = newsmapper.selectByPrimaryKey(id);
        return news;
    }

    /**
     * 新闻更新
     * @param news
     */
    public void updatenews(news news) {
        // TODO Auto-generated method stub
        newsmapper.updateByPrimaryKeySelective(news);
    }


}
