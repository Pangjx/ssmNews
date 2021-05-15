package com.ssmcrud;

import com.ssmcrud.bean.Employee;
import com.ssmcrud.bean.news;
import com.ssmcrud.dao.newsMapper;
import com.ssmcrud.dao.userMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

/**
 * @author ipllt
 * @create 2019-02-26 下午 2:31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    newsMapper newsmapper;

    @Autowired
    userMapper usermapper;

    @Autowired
    SqlSession sqlSession;

    /*测试departmentmapper*/
    @Test
    public void testCRUD(){

        //原生测试方法
        /*//1,创建springIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2,从容器中获取mapper
        DepartmentMapper ben = ioc.getBean(DepartmentMapper.class);*/

        /*，spring单元测试，可自动注入需要的组件
        * 1，导入springtest模块
        * 2，@ContextConfiguration注解
        * 3,直接autowired要使用的组件即可
        * */

        System.out.println(newsmapper);

        //1,插入几个部门

     /*   departmentMapper.insertSelective(new Department(null,"开发部"));
        departmentMapper.insertSelective(new Department(null,"测试部"));
    */

     //2,生成员工数据，测试员工插入
/*
        employeeMapper.insertSelective(new Employee(null,"jerry","M","jerry@pl.com",1));
*/

        //3，批量插入多个员工，使用可以执行批量操作的sqlsession

      /*  for (){
            employeeMapper.insertSelective(new Employee(null,,"M","jerry@pl.com",1));

        }*/

        newsMapper mapper = sqlSession.getMapper(newsMapper.class);
        Date date=new Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        for(int i=0;i<200;i++){
            String uid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new news(uid,sqlDate,"无","本地路径",1,false,false,"**************"));
        }
        System.out.println("批量添加员工成功");
    }
}
