<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
		<c:when test="${not empty company}">
			<h1>${company}사 환영합니다</h1>
			<div>
				<span></span>
			</div>
		
		</c:when>
		<c:when test="${empty company}">
			<div>
				<a href="/practice/login.company">로그인</a>
				<a href="/practice/join.company">회원가입</a>
			</div>
		</c:when>
	</c:choose>

</body>
</html>