<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글읽기</title>
<script>
	function del(){
		if(confirm('삭제하시겠습니까?')){
			location.href = 'delete?boardnum=${board.boardnum}';
		}
	}
</script>
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
	<div id="navigator">
		<a href="list">목록보기</a>
		
		<%-- 이건 로그인 한사람만 볼 수 있는것이고 우리는 로그인 한 그 사람만 수정할 수 있게 만들어야지
		<c:if test = "${sessionScope.loginId != null}"> 
		지금 아래있는 것은 본인이냐고 물어본 것이야--%>
		
		<c:if test = "${sessionScope.loginId == board.id}">
		<a href="update?num=${board.boardnum}">수정하기</a>
		
		<a href="javascript:del()" >삭제하기</a>
		<%--
		방법 1
		<a href="delete?boardnum=${board.boardnum}">삭제하기</a>
		 방법 2  
		<a href="delete?num=${board.boardnum}">삭제하기</a> 
		이건 보드객체로 받는 것이 아니라 그냥 num에 담아서 보내주는 것이니까 가서 받고 따로 board 객체를 만들어야지. 왜냐하면 필요하니까
		--%>
		</c:if>
	</div>
	
</body>
</html>