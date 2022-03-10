<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 관리</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>


</head>
<body>

	<h1>[ 학생 관리 ]</h1>
	<table>
	<tr>
		<th>반</th>
		<th>학번</th>
		<th>이름</th>
		<td>삭제</td>
		<td>수정</td>
	</tr>
	
	<c:forEach var="list" items= "${studentlist}">
		<tr>
			<td>${list.stclass}</td>
			<td>${list.stnum}</td>
			<td>${list.name}</td>
			
			<td><input type="button" value="삭제" onclick="location.href='delete?stnum=${list.stnum}'"></td>
			<td><input type="button" value="수정" onclick="location.href='edit?stnum=${list.stnum}'"></td>
		
		</tr>
	</c:forEach>
	
</table>
	
</body>
</html>
