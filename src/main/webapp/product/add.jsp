<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
</head>
<body>
	<form action="/practice/add-ok.product" method="post">
		<div>
			<span>상품명</span><input name="productName">
		</div>
		<div>
			<span>가격</span><input name="productPrice">
		</div>
		<div>
			<span>등록수량</span><input name="productStock">
		</div>
		
		<button>등록하기</button>
	</form>
	<a href="/practice/"><button>취소</button></a>
</body>
</html>