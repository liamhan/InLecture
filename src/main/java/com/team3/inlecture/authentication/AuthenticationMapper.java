package com.team3.inlecture.authentication;

import org.springframework.stereotype.Repository;

import com.team3.inlecture.member.MemberVO;

@Repository(value="authenticationMapper")
public interface AuthenticationMapper {
    public MemberVO getMemberById(String id);
    
}
