<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html width="100%" height="100%">

 <head>
   <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/common.css" />">
 </head>
	<body width="100%" height="100%">
	<div class="layout_header">
		<tiles:insertAttribute name="header" />
	</div>
	<div class="layout_middle">
		<div class="layout_menu">
			<tiles:insertAttribute name="menu" />
		</div>
		<div class="layout_body">	
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<div class="layout_footer">
		<tiles:insertAttribute name="footer" />
	</div>
	</body>
</html>