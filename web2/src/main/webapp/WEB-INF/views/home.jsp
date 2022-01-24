<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>web2</title>
</head>
<body>

<c:if test="${sessionScope.id != null}">
<h1>${sessionScope.id}(${name})님 환영합니다.</h1>
</c:if>



<h1>[ web2 예제 ]</h1>
<ul>
	<li>JSP 문법</li>
	<ol>
		<li><a href="res">리소스 사용</a></li>
		<li><a href="jstl">JSTL 코어라이브러리</a></li>
		<li><a href="jstl2">JSTL 함수 라이브러리</a></li>
	</ol>
</ul>

<br>

	<li><p>Parameter 전달</p></li>
		<ol>
			<li><a href="param1?num=100&name=abc">GET method로 parameter</a></li> 
			<!-- <li><a href="param1">GET method로 parameter</a></li>
			이렇게 물음표 뒤에 값을 넣어서.... 하는건데 ...-->
			<li><a href="param2">POST method로 parameter</a></li>
			<!-- <li><a href="">VO객체로 전달</a></li> -->
		</ol>
		
	<li><p>세션 테스트</p></li>	
	<ol>
	    <li><a href="session1">세션 테스트 - 세션에 값 저장</a></li>
	    <li><a href="session2">세션 테스트 - 세션에서 값 삭제</a></li>
   </ol>
   
   <li><p>쿠키 테스트</p></li>
   <ol>
   		<li><a href="cookie1">쿠키 저장</a></li>
   		<li><a href="cookie2">쿠키 삭제</a></li>
   		<li><a href="cookie3">쿠키 읽기</a></li>
   </ol>
		
</body>
</html>