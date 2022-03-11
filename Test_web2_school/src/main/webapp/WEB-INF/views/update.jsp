<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생정보 수정</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>

<script>
	function formCheck() {
		var stclass = document.getElementById('stclass');
		var name = document.getElementById('name');

		if (stclass.value.length != 1) {
			alert('반을 1문자로 입력하세요');
			return false;
		}
		if (name.value == '') {
			alert('이름을 입력하세요');
			return false;
		}
		return true;
	}
</script>
</head>

<body>
	<h1>[ 학생정보 수정 ]</h1>
	
	<div style="text-align: center;">
	<form action="update" method="post" onsubmit="return formCheck();">
		<input type="hidden" name="stnum" value="${student.stnum}">
	<table>
		<tbody>
			<tr>
				<td style="width:70px;">학번</td><td style="text-align: left;">${student.stnum}</td>
			</tr>
			<tr>
				<td>반</td><td><input type="text" id="stclass" name="stclass" value="${student.stclass}"></td>
			</tr>
			<tr>
				<td>이름</td><td><input type="text" id="name" name="name" value="${student.name}"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정">
					<input type="button" value="취소" onclick="javascript:location.href='list';">
				</td>
			</tr>
		</tbody>
	</table>
	</form>
	</div>
	
</body>
</html>
