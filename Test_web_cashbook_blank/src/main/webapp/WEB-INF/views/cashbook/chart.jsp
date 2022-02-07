<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연도별 통계</title>
<script src='../js/jquery-3.6.0.js" />'></script>
</head>
<body>

	<h1>[ 연도별 통계 ]</h1>
	
	<table>
	<tr >
		<th>연도</th>
		<th>   수입총합계</th>
		<th>   지출총합계</th>
	</tr>
	<c:forEach var="chart" items="${chartlist}">
		<tr>
			<td>${chart.inputdate}</td>
			<td>${chart.type}</td>
			<td>${chart.memo}</td>
		</tr>
	</c:forEach> 
</table>
		
</body>
</html>
