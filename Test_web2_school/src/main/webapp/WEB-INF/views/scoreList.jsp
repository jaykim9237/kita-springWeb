<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체성적 보기</title>
<script>

</script>
<style>
h1 {
	width: 300px;
	text-align: center;
}
th {
	text-align: left;
}
</style>
</head>
<body>
<h1>[ 전체 성적 ]</h1>

<table>
	<tr>
		<th style="width:60px;">학번</th>
		<th style="width:60px;">Java</th>
		<th style="width:60px;">SQL</th>
		<th style="width:60px;">Spring</th>
		<th style="width:60px;">총점</th>
		<th style="width:60px;">평균</th>
	</tr>
	
	<c:forEach var="score" items="${list}">
		<tr>
			<td>${score.stnum}</td>
			<td>${score.java}</td>
			<td>${score.sql}</td>
			<td>${score.spring}</td>
			<td>${score.total}</td>
			<td>${score.avg}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>
