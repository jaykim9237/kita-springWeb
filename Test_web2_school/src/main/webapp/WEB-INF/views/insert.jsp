<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생등록</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>

<script>
 	function formCheck() {
		var stnum = document.getElementById('stnum');
		var stclass = document.getElementById('stclass');
		var name = document.getElementById('name');

		if (stnum.value == '') {
			alert('학생 번호를 입력하세요');
			return false;
		}
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
	<h1>[ 학생등록 ]</h1>
	
	<form action="insert" method="post" onsubmit="return formCheck();">
	<table>
		<tbody>
			<tr>
				<td style="width:70px;">학번</td>
				<td><input type="text" id="stnum" name="stnum"></td>
			</tr>
			<tr>
				<td>반</td>
				<td><input type="text" id="stclass" name="stclass"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center;">
					<input type="submit" value="등록">
					<input type="button" value="취소" onclick="javascript:location.href='./'">
				</td>
			</tr>
		</tbody>
	</table>
	</form>
	
</body>
</html>
