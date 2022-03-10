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

	<h1>[ 전체 성적 ]</h1>
	<table>
	<tr>
		<th>학번</th>
		<th>Java</th>
		<th>SQL</th>
		<td>Spring</td>
		<td>총점</td>
		<td>평균</td>
	</tr>
	
	<c:forEach var="list" items= "${scorelist}">
		<tr>
			<td>${list.stnum}</td>
			<td>${list.java}</td>
			<td>${list.sql}</td>
			<td>${list.spring}</td>
			<td>${list.total}</td>
			<td>${list.avg}</td>
			</tr>
	</c:forEach>
	
</table>
	
	
</body>
</html>
