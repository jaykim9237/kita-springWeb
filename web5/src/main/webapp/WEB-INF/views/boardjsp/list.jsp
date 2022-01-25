<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>[게시판]</h1>


<!-- 게시판 글 목록 출력될 영역 -->


<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>조회수</th>
		<th>등록일</th>
	</tr>
<c:forEach var="board" items="${list}">
<%-- ${ }안에 들어가는 것 리스트로 하는거 아니고 var값으로 불러와야해 --%>
	<tr>
		<td>${board.boardnum}</td>
		<td><a href="read?num=${board.boardnum}">${board.title}</a></td>
		<td>${board.id}</td>
		<td>${board.hits}</td>
		<td>${board.inputdate}</td>
	</tr>
</c:forEach>
</table>
<!-- 페이지 이동 및 검색 폼 영역 -->
<p><input type="button" value="글쓰기" onclick="location.href='write'"></p>
<p><a href="write">글쓰기</a></p>
</body>
</html>