<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
<style>
	/* CSS 주석*/
</style>
<script>
	//javascript 주석
	/*javascript 주석*/
</script>
</head>
<body>
	<!--HTML 주석-->
	<%--JSP 주석 이거는 사라져 서버에서 안보여 소스에만 남아--%>
	<h1>[ JSTL 코어 라이브러리 ]</h1>
	<h1>헉 너무 배고픈데</h1>
	<h1>으아ㅏㅏ 따라는 하고 있는데 모르겠다 ㅠ</h1>
	<p><img src="resources/image/que.png"></p>
	<p>${number}</p>
	<p>${number *2}</p>
	<p>${number == 2}</p>
	<p>${number %2}</p>
	<p>${str}</p>
	<p>${list}</p>
	<p>${phone}</p>
	<p>${date}</p>
	
	<p>*if 태그</p>
	<!-- 	꼭 서야 하는 것이 if -->
	
	<c:if test="${number != 2}">
	
	<p>저 테스트 안이 참이면 c:if 안에 있는 것들이 실행이 되고 아니면 실행이 되지 않음</p>
	<p>출력된 내용</p>
	</c:if>
	
	<p>*if 태그 - 문자열 비교</p>
	<c:if test="${str == 'abc'}">
		<p> str의 값은 abc입니다.</p>
	</c:if>
	
	<p>* choose</p>
	
	<c:choose>
		<c:when test="${number ==1}">
			<p>num의 값은 1이다.</p>
		</c:when>
		<c:when test="${number ==2}">
			<p>num의 값은 2이다.</p>
		</c:when>
		<c:when test="${number ==3}">
			<p>num의 값은 3이다.</p>
		</c:when>
		<c:otherwise>
			<p>num의 값은 그 이외의 것이다.</p>
		</c:otherwise>
		
	</c:choose>
	
	<p>* forEach</p>
	
	<c:forEach var="cnt" begin="1" end="5">
	<p> 반복되는 내용 ${cnt}</p>
	</c:forEach>
	
	<c:forEach var="i" begin="0" end="${list.size() - 1}">
		<p>${list.get(i)}</p>
	</c:forEach>
	
	<c:forEach var="value" items="${list}">
		<p>${value}</p>
	</c:forEach>
	
	<p>*forEach의 활용</p>
	<select>
		<c:forEach var="cnt" begin="1" end="12">
			<option>${cnt}</option>
		</c:forEach>
	</select>월
	
	<select>
		<c:forEach var="cnt" begin="1" end="31">
			<option>${cnt}</option>
		</c:forEach>
	</select>일<br>
	
	<p>*forTokens</p>
	<p>쪼개어 사용할 때</p>
	<table>
	<c:forTokens var="value" items="${phone}" delims="-">
		<tr>
		<td>${value }</td>
		</tr>
	</c:forTokens>
	</table>
	
	<p>* out</p>
	<p>전부 그냥 나와/문자열을 그대로 보여주는 것</p>
	<c:out value="${data}"></c:out>
 	
	<p>* url</p>
	<!--  현재 경로가 http://localhost:8888/web2/jstl  결론적으로 상대적 표현도 절대적 표현도 틀릴 수가 있는거야
	그걸 방지 하기 위해서 생긴 것이 url태그인거야-->
	<p><img src="/resources/image/dizzy.png"></p>
	<p><img src="resources/image/dizzy.png"></p>
	<p><img src="<c:url value = "/resources/image/dizzy.png" />"></p> 
	
</body>
</html>