package com.team3.inlecture.hello;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("bookService")
public class HelloService {
     
    @Resource(name="helloDao")
    private HelloDao helloDao;
 
    public List<Student> getStudentList() {
        return helloDao.getStudentList();
    }
 
}
