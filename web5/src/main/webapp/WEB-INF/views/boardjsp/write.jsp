<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
<script>
function formCheck(){
	var title = document.getElementById('title');
	var contents = document.getElementById('contents');

	if(title.value.length < 3){
		alert("제목을 입력하세요.");
		title.focus();
		title.select();
		return false;
		}
	if(contents.value.length < 3){
		alert("내용을 입력하세요.");
		contents.focus();
		contents.selsct();
		return false;
		}
	return true;
}
</script>


</head>
<body>
<h1>[게시판 글쓰기]</h1>

<!-- 여기에 있는 name이랑, board.java에 있는 변수명이랑 rkxdkdigo  -->
<form id="write" action="write" method="post" onsubmit="return formCheck()">
	<table>
		<tr>
		<th>제목</th>
		<td><input type="text" name="title" id="writeTitle" style="width:400px;"></td>
		</tr>
		
		<tr>
		<th>내용</th>
		<td><textarea name="contents" id="writeContents" style="width:400px;height:200px;resize:none;"></textarea></td>
		</tr>
		
		<tr>
		<th>파일첨부</th>
		<td><input type="file" name="upload" size="30" ></td>
		</tr>
		
	</table>
		<input type="submit" value="저장">

</form>
</body>
</html>