<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
	<table id="product-table">
		<tr>
			<th></th>
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
	<hr />
	
	<form id="order-form" action="/practice/write-ok.order" method="post">
		<table id="order-table">
			<tr>
				<td>판매사</td>
				<td>상품명</td>
				<td>주문수량</td>
			</tr>
		</table>
		<button id="order-button" type="button" style="display: none;">주문하기</button>
	</form>
</body>
<script type="text/javascript">
const products = JSON.parse(`${productList}`);
console.log(products);
const table = document.querySelector("#product-table");

products.forEach(({id, productName, productPrice, productStock, companyName, companyPhone, companyAddress}) => {
	table.innerHTML += (
		"<tr>" +
		"<td>" + "<input name='id' type='checkbox' value='"+ id +"'/>" + "</td>" +
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
	NodeList.prototype.find = Array.prototype.find;

	
	const inputs = document.querySelectorAll("#product-table input");
	const orderTable = document.querySelector("#order-table");
	const button = document.querySelector("#order-button");
	
	inputs.forEach((input) => {
		input.addEventListener("click", (e) => {
			const orderId = e.target.value
			const selectProduct = products.find((product) => product.id === Number(orderId))
			const {id, productName, productPrice, productStock} = selectProduct
			const tr = document.createElement("tr");
			
			tr.innerHTML = (
				"<tr>" +
					"<input name='productId' type='hidden' value='"+ id +"'/>" +
					"<td>" + productName + "</td>" +
					"<td>" + productPrice + "</td>" + 
					"<td>" + "<input name='productCount' value='1' min='1' />" + "</td>" +
				"</tr>"
			)
			if(e.target.checked){
				orderTable.appendChild(tr);
				button.style.display = "block";
			}else {
				const trs = document.querySelectorAll("#order-table > tr")
				const selectTrs = trs.find((tr) => tr.childNodes[0].value === orderId)
				orderTable.removeChild(selectTrs)
				
				const removedTrs = document.querySelectorAll("#order-table > tr")
				button.style.display = trs.length === 0 ? "none" : "block";
			}
		})
	})
	
	
</script>

</html>