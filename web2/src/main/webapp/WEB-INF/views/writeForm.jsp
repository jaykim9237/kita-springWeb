<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST method로 parameter보내기</title>
</head>
<body>
	<form action="write" method="post">
	<!-- 네임이 붙은 것만 전송이 된다. -->
	
	이름:      <input type="text" name="name"><br>
	전화번호:	  <input type="text" name="phone"><br>
	통신사:	KT<input type="radio" name="com" value="kt"><br>
			LG<input type="radio" name="com" value="lg"><br>
			SK<input type="radio" name="com" value="sk"><br>
			  <input type="submit" value="전송하기">
	
	
	</form>
</body>
</html>