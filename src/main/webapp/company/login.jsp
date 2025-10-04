<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기업로그인</title>
</head>
<body>
	<form action="/practice/login-ok.company" method="post">
		<div>
			<span>기업명</span><input name="companyName">
		</div>
		<div>
			<span>비밀번호</span><input name="companyPassword">
		</div>
	
		<button>로그인</button>
	</form>
</body>
</html>