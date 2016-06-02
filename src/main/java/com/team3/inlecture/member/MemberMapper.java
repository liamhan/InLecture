package com.team3.inlecture.member;

import org.springframework.stereotype.Repository;

@Repository(value="memberMapper")
public interface MemberMapper {
	public Integer insertMember(MemberVO memberVO);
}
