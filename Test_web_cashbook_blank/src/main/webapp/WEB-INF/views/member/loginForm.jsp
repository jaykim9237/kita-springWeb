<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src='../js/jquery-3.6.0.js" />'></script>
<script>
//로그인 폼 검사
function formCheck() {
	var id = document.getElementById('userid');
	var password = document.getElementById('userpwd');
	
	if (id.value == '' || password.value == '') {
		alert('ID와 비밀번호를 입력하세요.');
		return false;
	}
	
	if (id.value.length < 3 || id.value.length > 10) {
		alert("ID는 3~10자로 입력하세요.");
		return false;
	}
	
	if (password.value.length < 3 || password.value.length > 10) {
		alert("비밀번호는 3~10자로 입력하세요.");
		return false;
	}
	return true;
}
</script>
</head>
<body>

	<h1>[ 로그인 ]</h1>
	
<form id="loginForm" action="login" method="post" onSubmit="return formCheck();">
	<table>
	<tr>
		<td >ID</td>
		<td><input type="text" name="userid" id="userid" /></td>
	</tr>
	<tr>
		<td >Password</td>
		<td><input type="password" name="userpwd" id="userpwd" /></td>
	</tr>
	
	<tr>
		<td colspan="2" >
			<input type="submit" value="Login" />
		</td>
	</tr>
</table>
</form>
</body>
</html>
