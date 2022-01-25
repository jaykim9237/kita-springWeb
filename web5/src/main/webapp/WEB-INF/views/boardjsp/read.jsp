<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글읽기</title>
</head>
<body>
<h1>[게시판 글읽기]</h1>
	<table>
		<tr>
			<th>글번호</th>
			<td>${board.boardnum}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.id}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${board.inputdate}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.hits}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${board.contents}</td>
		</tr>
		<tr>
			<th>파일첨부</th>
			<td></td>
		</tr>
	</table>
	<input type="button" value="삭제">
	<a href="list">목록보기</a>
	<a href="update?num=${board.boardnum}">수정하기</a>
</body>
</html>