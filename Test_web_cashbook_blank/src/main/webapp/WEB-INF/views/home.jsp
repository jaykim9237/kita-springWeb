<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일일 가계부</title>
<script src='js/jquery-3.6.0.js" />'></script>
</head>
<body>

<h1>[ 일일 가계부 ]</h1>
<c:if test="${loginId != null}">
	<h2>
	항상 반가운 ${sessionScope.loginId}님 환영합니다 :)<br>
	</h2>
	<h4>호랑이의 해 2022년 기운차고 대범한 한 해 되세요.</h4>
</c:if>	

<c:if test="${loginId == null}">
	<ul>
		<li><a href="member/join">회원 가입</a>
		<li><a href="member/login">로그인</a>
	</ul>
</c:if>
		
<c:if test="${loginId != null}">
	<ul>
	<li><a href="member/logout">로그아웃</a>
	<li><a href="cashbook/cashbook">가계부</a>
	<li><a href="cashbook/chart">연도별 통계</a>
	</ul>
</c:if>
</body>
</html>
