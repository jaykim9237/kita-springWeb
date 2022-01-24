<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function formCheck(){
	let password = document.getElementById('password');
	let password2 = document.getElementById('password2');
	let name = document.getElementById('name');
	
	if(password.value != password2.value){
		alert("비밀번호를 정확하게 입력해주세요") 
		return false;
	}
	if (name.value == ''){
	alert('이름을 입력해주세요.')
	return false;
		}
	return true;
}

</script>
</head>
<body>
<h1>[회원 정보 수정]</h1>
	<form method="post" action="update" onsubmit="return formCheck()">
		<table>

		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="password" id="password" required="required">
			</td>
		</tr>
		<tr>
			<th>비밀번호 재입력</th>
			<td><input type="password" name="password" id="password">
			</td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" id="name" value="${member.name}">
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><input type="tel" name="phone" id="tel" value="${member.phone}">
			</td>
		</tr>
		<tr>
			<th>주소</th>
			<td><input type="text" name="address" id="address" style="width:300px" value="${member.address}">
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="email" name="email" id="email" value="${member.email}">
			</td>
		</tr>
		</table>
		
		<input type="submit" value="수정" >
		<input type="reset" value="다시쓰기">
		
	</form>
</body>
</html>