<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생관리</title>
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
<h1>학생관리</h1>

<table>
	<tr>
		<th style="width:50px;">반</th>
		<th style="width:100px;">학번</th>
		<th style="width:100px;">이름</th>
		<th style="width:50px;">삭제</th>
		<th style="width:50px;">수정</th>
	</tr>
	
	<c:forEach var="st" items="${list}">
	<tr>
		<td>${st.stclass}</td>
		<td>${st.stnum}</td>
		<td>${st.name}</td>
		<td><input type="button" value="삭제" onclick="location.href='delete?stnum=${st.stnum}'"></td>
		<td><input type="button" value="수정" onclick="location.href='update?stnum=${st.stnum}'"></td>
	</tr>
	</c:forEach>

</table>
</body>
</html>
