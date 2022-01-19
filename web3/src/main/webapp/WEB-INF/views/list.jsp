<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
	<style>
		table,td{
		 border: 1px solid black;
		}
		td{
			width: 100px;
		}
	</style>
</head>
<body>
	${list}<br>
	
	<table>
	<c:forEach var="m" items="${list}">
		<tr>
			<td><a href="info?id=${m.id}">${m.id}</a></td>
			<td><a href="delete?id=${m.id}">>삭제</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>