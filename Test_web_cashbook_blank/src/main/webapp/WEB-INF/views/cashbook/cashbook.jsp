<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일일 가계부</title>
<script src='<c:url value="/js/jquery-3.6.0.js" />'></script>
<script>


  function formCheck() {
	var memo = document.getElementById('memo');
	var amount = document.getElementById('amount');
	
	if (memo.value == '' || amount.value == '') {
		alert('내용을 입력하세요.');
		return false;
		}
		return true; 
	} 
</script>
</head>
<body>

	<h2>[내 가계부]</h2>

	<form action="income" method="post" onsubmit="return formCheck();">	
		<table>
		<tr><th>구분</th>
		<td><input type="radio" name ="type" value="수입" checked>수입
			<input type="radio" name ="type" value="지출">지출
		</td>
		</tr>
		<tr><th>메모</th>
		<td><input type="text" placeholder="내용입력" name="memo" id="memo"></td>
		</tr>
		<tr><th>금액</th>
		<td><input type="text" placeholder="금액입력(숫자)" name="amount" id="amount"></td>
		</tr>
		<tr><td colspan="2">
		<input type="submit" value="등록"/></td>
		</tr>
		</table>
		
		<input type="hidden" name = "infonum" >
		<input type="hidden" name = "userid" >
		
	</form>

<form action="delete" method="GEt">
<table>
	<tr >
		<th>번호</th>
		<th>날짜</th>
		<th>구분</th>
		<th>메모</th>
		<th>금액</th>
	</tr>
	<c:forEach var="cashbook" items="${cashbooklist}">
		<tr>
			<td>${cashbook.infonum}</td>
			<td>${cashbook.inputdate}</td>
			<td>${cashbook.type}</td>
			<td>${cashbook.memo}</td>
			<td>${cashbook.amount}</td>
		
			<td><input type= "hidden" value=></td>
			<td><input type="submit" value="삭제"></td>
		</tr>
	</c:forEach> 
</table>
</form>


</body>
</html>
