<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 관리</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>
</head>
<body>

	<h1>[ 학생 성적 관리 ]</h1>
	<blockquote>	

	<c:if test="${sessionScope.loginId == null}">
		<p><a href="login">관리자 로그인</a></p>
	</c:if>

	<c:if test="${sessionScope.loginId != null}">
		<p><a href="logout">로그아웃</a></p>
		<p><a href="insert">학생등록</a></p>
		<p><a href="list">학생관리</a></p>
		<p><a href="scoreInsert">성적입력</a></p>
		<p><a href="scoreList">전체성적보기</a></p>
		<p><a href="stats">통계</a></p>
	</c:if>
	
	</blockquote>
</body>
</html>
