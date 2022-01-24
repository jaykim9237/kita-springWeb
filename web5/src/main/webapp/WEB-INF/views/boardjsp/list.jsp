<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>[게시판]</h1>

<p><input type="button" value="글쓰기" onclick="location.href='write'"></p>
<p><a href="write">글쓰기</a></p>

<!-- 게시판 글 목록 출력될 영역 -->
<form>
	<table>
		<tr>
		<th>제목</th>
		<td><input type="text" name="writeTitle" id="writeTitle"></td>
		</tr>
		
		<tr>
		<th>내용</th>
		<td><input type="text" name="writeContents" id="writeContents"></td>
		</tr>
		
		<tr>
		<th>파일첨부</th>
		<td><input type="file" name="writeFile" id="writeFile"></td>
		</tr>
		
	</table>
		<input type="submit" value="제출하기">

</form>
<!-- 페이지 이동 및 검색 폼 영역 -->
</body>
</html>