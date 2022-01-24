<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>web5</title>
</head>
<body>

<h1>[ Springweb5 ]</h1>
	<c:if test="${sessionScope.loginId != null}">
		<h2>${sessionScope.loginID}님 환영합니다.</h2>
	</c:if>

//POST 없으면 다 GET방식이야
	
	<c:if test="${sessionScope.loginId == null}">
		<p><a href="member/join">회원가입</a></p>
		<p><a href="member/login">로그인</a></p>
	</c:if>
	<c:if test="${sessionScope.loginId != null}">
		<p><a href="member/update">개인정보수정</a></p>
		<p><a href="member/logout">로그아웃</a></p>
	</c:if>
<p><a href="board/list">게시판</a></p>

</body>
</html>