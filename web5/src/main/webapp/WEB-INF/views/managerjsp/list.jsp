<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 관리</title>
</head>
<body>
<h1>[멤버 관리]</h1>

<table>
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>게시글 수 </th>
	</tr>
<c:forEach var="member" items= "${list}">
<%-- ${ }안에 들어가는 것 리스트로 하는거 아니고 var값으로 불러와야해 --%>
	<tr>
		<td>${member.id}</td>
		<td>${member.password}</td>
		<td>${member.name}</td>
		<td>0</td>
	</tr>
</c:forEach>
</table>
</body>
</html>