<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인회원가입</title>
</head>
<body>
	<form action="/practice/join-ok.user" method="post">
		<div>
			<span>이메일</span><input name="userEmail">
		</div>
		<div>
			<span>비밀번호</span><input type="password" name="userPassword">
		</div>
		<div>
			<span>비밀번호 확인</span><input type="password" name="userPasswordConfirm">
		</div>
		<div>
			<span>이름</span><input name="userName">
		</div>
		<div>
			<span>나이</span><input name="userAge">
		</div>
		<div>
			<span>번호</span><input name="userPhone">
		</div>
		<div>
			<span>주소</span><input name="userAddress">
		</div>
	
		<button id="join-btn" type="button">회원가입</button>
	</form>
		<a href="/practice/"><button>취소</button></a>
</body>
<script type="text/javascript">
	const form = document.querySelector("form");
	const inputs = document.querySelectorAll("form input");
	const button = document.querySelector("#join-btn");
	globalThis.flag = [true, true];
	
	/* 값 유효성 검사 */
	button.addEventListener("click", (e) => {
		
		inputs.forEach((input) => {
			if(!input.value) { globalThis.flag[0] = false; } 
		});
		
		if(!globalThis.flag[0]) {
			return alert("값을 입력해주세요"); 
		};
		
		const password = form.elements.userPassword.value
		const passwordConfirm = form.elements.userPasswordConfirm.value
		
		if(password !== passwordConfirm) { return alert("비밀번호가 일치하지 않습니다"); }
		
		if(globalThis.flag.filter((flag) => flag).length === 2){
			form.submit();
		}
	})

</script>

</html>