<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<body>

<h1>[ 방명록 list]</h1>
<p><a href="write">글쓰기</a></p>


<!-- 이하 방명록 글들 출력 -->

	
	
	<c:forEach var = "board" items="${list}">
			<p>글번호 : ${board.num}</p>
			<p>작성자 : ${board.name}</p>
			<p>작성일 : ${board.inputdate}</p>
		<pre>${board.content}</pre>
		<form action="delete" method="post">
	<!-- 근데 그냥 패수워드만 가면 어느것을 지우는지 알수가 없잖아 -->
	
	<!-- 내가 방금 오류를 만들었거덩 뭐냐면, name으로 보내야 하는데 안보내고 오타를 냈어 -->
		<input type="hidden" name = "num" value="${board.num}">
			비밀번호: <input type="password" name="password">
			<input type="submit" value="삭제">
		</form>
	</c:forEach>

</body>
</html>
	
	
	
	
	
	
	