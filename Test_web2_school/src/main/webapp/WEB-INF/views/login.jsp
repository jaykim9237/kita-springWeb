<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>

<script>
	function formCheck() {
		var id = document.getElementById('id');
		var pw = document.getElementById('password');

		if (id.value.length < 3 || id.value.length > 10) {
			alert('아이디는 3~10 글자를 입력하세요');
			return false;
		}
		if (pw.value.length < 3 || pw.value.length > 10) {
			alert('비밀번호는 3~10 글자를 입력하세요');
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<h1>[ 관리자 로그인 ]</h1>
	<form action="login" method="post" onsubmit="return formCheck();">
	<table>
		<tbody>
			<tr>
				<td>아이디</td><td><input type="text" id="id" name="adminid"></td>
			</tr>
			<tr>
				<td>비밀번호</td><td><input type="password" id="password" name="adminpwd"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="로그인">
					<input type="button" value="취소" onclick="javascript:location.href='./'">
				</td>
			</tr>
		</tbody>
	</table>
	</form>
</body>
</html>

