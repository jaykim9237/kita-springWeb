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

	<h1>[ 성적 입력 ]</h1>
	
	
	<form action="addScore"  method="post">
		<table>
		<tr>
				<th>학번</th>
				<td>
					<input type="text" id="stnum" name="stnum" required="required">
				</td>
			</tr>
			<tr>
				<th>Java</th>
				<td>	
					<input type="number" id="java" name="java" required="required">
				</td>
			</tr>
			<tr>
				<th>SQL</th>
				<td>	
					<input type="number" id="sql" name="sql" required="required">
				</td>
			</tr>
			<tr>
				<th>Spring</th>
				<td>	
					<input type="number" id="spring" name="spring" required="required">
				</td>
			</tr>
		</table>
		
		<input type="submit" value="저장">
		<input type="reset" value="취소">
	</form>
	
</body>
</html>
