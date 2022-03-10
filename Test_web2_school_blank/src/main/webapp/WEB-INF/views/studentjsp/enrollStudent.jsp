<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 관리</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>

<script>
	function enrollFormCheck(){
		//아이디가 3~10자, 비밀번호가 3~10자
		let stnum = document.getElementById('stnum');
		let stclass = document.getElementById('stclass');
		let name = document.getElementById('name');
	
		if(stnum.value.length < 1){
			alert('학생 번호를 입력하세요');
			return false;
			}
		
		if(stclass.value.length < 1 || stclass.value.length > 1){
			alert('반을 1문자로 입력하세요');
			return false;
			}
	 	
		if(name.value.length < 1){
			alert('이름을 입력하세요');
			return false;
			}
}
</script>

</head>
<body>

	<h1>[ 학생 등록 ]</h1>
	
	<form action="enroll"  method="post" onsubmit="enrollFormCheck()">
		<table>
		<tr>
				<th>학번</th>
				<td>
					<input type="text" id="stnum" name="stnum" required="required">
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
