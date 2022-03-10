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

	<h1>[ 학생정보 수정 ]</h1>

	
	<form action="edit"  method="post" >
		<table>
		<tr>
				<th>학번</th>
				<td>
					<input type="text" id="stnum" name="stnum" value="${studentvo.stnum}">
				</td>
			</tr>
			<tr>
				<th>반</th>
				<td>	
					<input type="text" id="stclass" name="stclass" required="required">
				</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>	
					<input type="text" id="name" name="name" required="required">
				</td>
			</tr>
		</table>
		
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
	
</body>
</html>
