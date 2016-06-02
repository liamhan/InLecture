<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>	
</head>

<body>
<h2>로그인 </h2>
<form name="form1" method="post" action="loginProcess.do">
<c:if test="${error == 'true'}">
<p>로그인에 실패하셨습니다.</p>
</c:if>
<table>
    <tr height="40px">
        <td>유저ID</td>
        <td><input type="text" name="id"></td>
    </tr>
    <tr height="40px">
        <td>패스워드</td>
        <td><input type="password" name="pw"></td>
    </tr>
</table>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
<table>
    <tr>
        <td align="center"><input type="submit" value="로그인"></td>
        <td align="center"><input type="button" onclick="location.href='<c:url value='/member/signup.do'/>'" value="회원가입"></td>
    </tr>
</table>
</form>
</body>
</html>