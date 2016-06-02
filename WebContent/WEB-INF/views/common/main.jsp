<%@ page session="true" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>main</title>
</head>
<body>
	메인입니다
	
<ul class="nav navbar-nav navbar-right">
    <!-- 회원 권한이 없을 때 -->
    <sec:authorize access="hasRole('ROLE_ANONYMOUS')">
        <li><a href="member/signup.do">회원가입</a></li>
        <li><a href="authentication/login.do">로그인</a></li>
    </sec:authorize>

    <!-- 회원 권한이 있을 때 -->
    <sec:authorize access="hasRole('USER')">
        <li><a href="authentication/login.do">로그아웃</a></li>
    </sec:authorize>

    <!-- 여러 권한 체크 -->
    <sec:authorize access="hasRole('STUDENT')">
		<li>학생입니다.</li>
    </sec:authorize>
     <sec:authorize access="hasRole('TEACHER')">
		<li>교수입니다.</li>
    </sec:authorize>
</ul>
</body>
</html>