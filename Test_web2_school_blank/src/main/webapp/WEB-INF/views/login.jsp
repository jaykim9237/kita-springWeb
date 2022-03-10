<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 관리</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>

<script>
	function formCheck(){
		//아이디가 3~10자, 비밀번호가 3~10자
		let id = document.getElementById('adminid');
		let pwd = document.getElementById('adminpwd');
	
		if(id.value.length < 3 || id.value.length > 10){
			alert('ID는 3~10자로 입력하세요.');
			return false;
			}
	 	if(pwd.value.length <3 || pwd.value.length > 10){
			alert('ID는 3~10자로 입력하세요.');
			return false;
			}
	
}
</script>
</head>
<body>

	<h1>[ 관리자 로그인 ]</h1>
	<form action="login"  method="post" onsubmit="formCheck()"> 
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="adminid" id="adminid" required="required"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="adminpwd" id="adminpwd" required="required"></td>
			</tr>
		</table>
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
	</form>
	

</body>
</html>
