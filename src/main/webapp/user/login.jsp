<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 로그인</title>
</head>
<body>
	<form action="/practice/login-ok.user" method="post">
		<div>
			<span>이메일</span><input name="userEmail" />
		</div>
		<div>
			<span>비밀번호</span><input name="userPassword" />
		</div>
		<button>로그인</button>
	</form>
</body>
</html>