<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID중복확인</title>
<script>
function idInput(){
	opener.document.getElementById('id').value = '${searchId}';
	this.close();
}
</script>

</head>
<body>
[ID중복확인]
<form action="idcheck" method="post">
  검색할 ID <input type="text" name="searchId" id="searchId">
  			<input type="submit" value="검색">
</form>
	<!-- 검색 후에만 이곳에 검색 결과 출력 -->
	<c:if test="${searchId != null}">
		<!-- 사용가능 -->
		<c:if test="${member == null}">
			<p>${searchId} : 사용 가능한 ID입니다.</p>
			<p><input type="button" value="ID 사용하기" onclick="idInput()"></p>
		</c:if>
		<!-- 사용불가능 -->
		<c:if test="${member != null}">
			<p>${searchId} : 이미 사용중인 ID입니다.</p>
		</c:if>
	</c:if>
</body>
</html>