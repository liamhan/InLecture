package com.team3.inlecture.hello;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 
@Repository("helloDao")
public class HelloDao{
     
    @Autowired
    private SqlSession sqlSession;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
 
    public List<Student> getStudentList() {
         
        return sqlSession.selectList("getStudentList");
    }
 
}