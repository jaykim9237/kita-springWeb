<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src='../js/jquery-3.6.0.js" />'></script>
<script>
function formCheck() {
	//ID가 3~10자, 비밀번호가 3~10자, 비밀번호는 두번 같게 입력, 이름은 필수입력
	let id = document.getElementById("userid");
	let pw = document.getElementById("userpwd");
	let pw2 = document.getElementById("userpwd2");
	
	
	if (id.value.length < 3 || id.value.length > 10) {
		alert('ID는 3~10자로 입력하세요.');
		return false;
	}
	if (pw.value.length < 3 || pw.value.length > 10) {
		alert('비밀번호는 3~10자로 입력하세요.');
		return false;
	}
	if (pw.value != pw2.value) {
		alert('비밀번호가 일치하지 않습니다..');
		return false;
	}
	
	return true;
}
</script>
</head>
<body>

	<h1>[ 회원가입 ]</h1>
	
<form action="join"  method="post" onsubmit="return formCheck()">
ID			<input type="text" name="userid" id="userid">
			<br>
비밀번호		<input type="password" name="userpwd" id="userpwd">
			<br>
비밀번호 확인	<input type="password" id="userpwd2">
			<br>
			<input type="submit" value="가입">
			<input type="reset" value="취소">
</form>
		
</body>
</html>
