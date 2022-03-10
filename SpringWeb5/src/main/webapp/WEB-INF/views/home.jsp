<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Web5</title>

<script>
function viewChange() {
	var view = document.getElementById("view");
	view.innerHTML = '<form>이름 <input type="input"></form>';
}
</script>

</head>
<body>
<h1>[ web5 ]</h1>

<c:if test="${sessionScope.loginId != null}">
	<p>${sessionScope.loginName} (${sessionScope.loginId})님 로그인 중</p>
</c:if>
<ul>
<c:if test="${sessionScope.loginId == null}">
	<li><a href="member/join">회원가입</a></li>
	<li><a href="member/login">로그인</a></li>
</c:if>
<c:if test="${sessionScope.loginId != null}">
	<li><a href="member/logout">로그아웃</a></li>
	<li><a href="member/update">개인정보 수정</a></li>
</c:if>	
	<li><a href="board/list">게시판</a></li>
</ul>


<!-- 쪽지 오른쪽 페이지 바뀌는 js 는 innerHTML jq는 HTML -->
<div id="view">lasjeflajwef</div>
<input type="button" value="테스트" onclick="viewChange()")>
</body>
</html>
