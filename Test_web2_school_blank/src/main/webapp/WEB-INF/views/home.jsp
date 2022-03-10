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
	
	<!-- 로그인 안 했을 때 -->
<c:if test="${sessionScope.loginId == null}">
	<p><a href="login">관리자 로그인</a></p>
</c:if>
	
	<!-- 로그인 했을 때 -->
<c:if test="${sessionScope.loginId != null}">
	<p><a href="logout">로그아웃</a></p>
	
	<p><a href="student/enroll">학생등록</a></p>
	
	<p><a href="student/manager">학생관리</a></p>
	
	<p><a href="score/add">성적입력</a></p>
	
	<p><a href="score/list">전체성적보기</a></p>
	
	<p><a href="score/chart">통계</a></p>
</c:if>
</body>
</html>
