<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body></body>

	<c:choose>
		<c:when test="${not empty company}">
			<h1>${company.companyName}사 환영합니다</h1>
			<div>
				<a href="/practice/add.product"><button>상품등록</button></a>
				<a href="/practice/companyList.product"><button>상품목록</button></a>
				<a href="/practice/logout-ok.company"><button>로그아웃</button></a>
			</div>
		</c:when>
		<c:when test="${not empty user}">
			<h1>${user.userName}님 환영합니다</h1>
			<div>
				<a href="/practice/add.card"><button>카드등록하기</button></a>
				<a href="/practice/userList.product"><button>주문하기</button></a>
				<a href="/practice/logout-ok.user"><button>로그아웃</button></a>
			</div>
		</c:when>
		<c:when test="${empty company && empty user}">
			<div>
				<h1>상품몰</h1>
			</div>
			
			<div>
				<a href="/practice/join.user"><button>개인 회원가입</button></a>
				<a href="/practice/login.user"><button>개인 로그인</button></a>
				<a href="/practice/join.company"><button>기업 회원가입</button></a>
				<a href="/practice/login.company"><button>기업 로그인</button></a>
			</div>
		</c:when>
	</c:choose>
</html>