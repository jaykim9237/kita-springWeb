<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function formCheck(){
	//아이디가 3~10자, 비밀번호가 3~10자
	let id = document.getElementById('id');
	let password = document.getElementById('password');
	let password2 = document.getElementById('password2');
	let name = document.getElementById('name');
	

	if(id.value.length < 3 || id.value.length > 10){
		alert('ID는 3~10자로 입력하세요.');
		return false;
		}
 	if(password.value.length <3 || password2.value.length > 11){
		alert('ID는 3~10자로 입력하세요.');
		return false;
		}
	if(password.value != password2.value){
		alert("비밀번호를 정확하게 입력해주세요") 
		return false;
		}
	return true;
}

function idCheckOpen(){
	window.open('idcheck', 'win', 'left=500,top=200,width=400,height=300');
}
</script>
</head>
<body>
	<h1>[회원가입]</h1>
	<form method="post" action="join" onsubmit="formCheck()">
		<table>
		<tr>
			<th>ID</th>
			<td><input type="text" name="id" id="id" required="required" readonly="readonly">
				<input type="button" onclick="idCheckOpen()" value="아이디 중복확인">
			</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="password" id="password" required="required">
			</td>
		</tr>
		<tr>
			<th>비밀번호 재입력</th>
			<td><input type="password" name="password2" id="password2" required="required">
			</td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" id="name" required="required">
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><input type="tel" name="phone" id="tel">
			</td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type="text" name="address" id="address">
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="email" name="email" id="email">
			</td>
		</tr>
		</table>
		
		<input type="submit" value="가입" >
		<input type="reset" value="다시쓰기">
		
	</form>
</body>
</html>