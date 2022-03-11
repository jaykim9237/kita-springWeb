<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 입력</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>
</head>

<body>
	<h1>[ 성적 입력 ]</h1>
	
	<form action="scoreInsert" method="post" onsubmit="return formCheck();">
	<table>
		<tbody>
			<tr>
				<td style="width:70px;">학번</td>
				<td><input type="text" id="stnum" name="stnum"></td>
			</tr>
			<tr>
				<td>Java</td>
				<td><input type="text" id="java" name="java" value="0"></td>
			</tr>
			<tr>
				<td>SQL</td>
				<td><input type="text" id="sql" name="sql" value="0"></td>
			</tr>
			<tr>
				<td>Spring</td>
				<td><input type="text" id="spring" name="spring" value="0"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="저장">
					<input type="button" value="취소" onclick="javascript:location.href='./'">
				</td>
			</tr>
		</tbody>
	</table>
	</form>
	
</body>
</html>
