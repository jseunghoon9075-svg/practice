<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카드등록</title>
</head>
<body>
	<form action="/practice/add-ok.card" method="post">
		<div>
			<span>카드명</span><input name="userCardName">
		</div>
		<div>
			<span>카드번호</span><input name="userCardNumber">
		</div>
	
		<button>등록하기</button>
	</form>
</body>
</html>