<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<h1>[JSTL - 함수 사용]</h1>
	<p>원본 문자열 : ${str}</p>
	<p>substring : ${fn:substring(str, 2, 8)}</p>
	<!-- db에 저장은 모두 되어 있지만 화면에서 일부만 보여주고 싶을 때 사용하는 것  -->
	<p>toUpperCase : ${fn:toUpperCase(str)} </p>
	<p>toLowerCase : ${fn:toLowerCase(str)}</p>
	<!-- 일시적으로 대소문자를 바꾸어 주는 것 -->
	<p>length : </p>
	<p>split :
	 	<c:set var="ar" value="${fn:split(str. ' ')}" />
	 	<c:forEach var="item" items="${ar}">
	 		${item}
	 	</c:forEach>
	 	
	 </p>
	<p></p>
	
</body>
</html>