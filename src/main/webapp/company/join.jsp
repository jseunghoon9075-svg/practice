<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기업 회원가입</title>
</head>
<body>
 	<h1>기업 회원가입</h1>
	
	<form action="/practice/join-ok.company" method="post">
		<div>
			<span>기업명</span><input name="companyName">
		</div>
		<div>
			<span>비밀번호</span><input type="password" name="companyPassword">
		</div>
		<div>
			<span>비밀번호확인</span><input type="password" name="companyPasswordConfirm">
		</div>
		<div>
			<span>사업자번호</span><input name="companyPhone">
		</div>
		<div>
			<span>주소</span><input name="companyAddress">
		</div>
		<button type="button">기업 등록하기</button>
	</form> 	
</body>
<script type="text/javascript">
	const form = document.querySelector("form");
	const inputs = document.querySelectorAll("form input");
	const button = document.querySelector("button");
	globalThis.flag = [true, true];
	
	button.addEventListener("click", (e) => {
		
		
		inputs.forEach((input) => {
			if(!input.value) { globalThis.flag[0] = false; }
		});
		
		if(!globalThis.flag[0]){
			return alert("값을 입력해주세요");
		}
		
		const password = form.elements.companyPassword.value
		const passwordConfirm = form.elements.companyPasswordConfirm.value
		if(password !== passwordConfirm) { return alert("비밀번호가 일치하지 않습니다."); }
		
		
		if(globalThis.flag.filter((flag) => flag).length === 2) {
			form.submit();	
		}
			
	})
	

</script>

</html>