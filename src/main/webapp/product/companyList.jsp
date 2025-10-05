<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
	<table>
		<tr>
			<th>판매사</th>
			<th>판매사번호</th>
			<th>판매사주소</th>
			<th>상품번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>수량</th>
		</tr>
	</table>
	<a href="/practice/"><button>메인으로</button></a>
</body>
<script type="text/javascript">
	const products = JSON.parse(`${productList}`);
	console.log(products);
	const table = document.querySelector("table");
	
	products.forEach(({id, productName, productPrice, productStock, companyName, companyPhone, companyAddress}) => {
		table.innerHTML += (
			"<tr>" +
			"<td>" + companyName + "</td>" +	
			"<td>" + companyPhone + "</td>" +	
			"<td>" + companyAddress + "</td>" +	
			"<td>" + id + "</td>" +	
			"<td>" + productName + "</td>" +	
			"<td>" + productPrice + "</td>" +	
			"<td>" + productStock + "</td>" +	
			"</tr>"
		)
		
	})

</script>

</html>