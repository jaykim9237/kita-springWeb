<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기</title>
<link rel="stylesheet" type="text/css" href="../resources/css/default.css" />

<script>
//글쓰기폼 확인
function formCheck() {
	var title = document.getElementById('title');
	var contents = document.getElementById('contents');
	
	if (title.value.length < 5) {
		alert("제목을 입력하세요.");
		title.focus();
		title.select();
		return false;
	}
	if (contents.value.length < 5) {
		alert("내용을 입력하세요.");
		contents.focus();
		contents.select();
		return false;
	}
	return true;
}
</script>	
</head>
<body>
<div class="centerdiv">
<h1>[ 글쓰기 ]</h1>
<!-- 바이너리 데이터 포함되는 폼. enctype 반드시 정확히 지정 -->
<form id="writeform" action="write"  method="post" 
	enctype="multipart/form-data" onsubmit="return formCheck();">
	<!-- 이거 우리가 처음보는거, 파일을 업로드 할 때 필요한 것, 만약에 업로드가 안되면 
	이거를 제일 멈저 확인해야해. enctype을 지정해줘야 함-->
<table>
<tr>
	<th>제목</th>
	<td>
		<input type="text" name="title" id="title" style="width:400px;">
	</td>
</tr>
<tr>
	<th>내용</th> 
	<td>
		<textarea name="contents" id="contents" style="width:400px;height:200px;resize:none;"></textarea>
	</td>
</tr>
<tr>
	<th>파일첨부</th> 
	<td>
		<input type="file" name="upload" size="30">
		<!-- 보드객체에 안만들어 줬던 것들은 따로 선언을 해줘야해, 우리가 포스트로 
		WRITE 메서드에 값들을 전달을 할거잖아 name이 중요해 , MultipartFile upload컨트롤러에서 이부분--파일에 대한 타입 -->
	</td>
</tr>
<!-- 
<tr>
		1.만약에 파일을 2개 업로드 할거면 두개 따로 받아서 선언을 해주거나, 변수를 두개 받아주는거야
		2. 같은 파일을 담는거 있잖아, ArrayList로 받으면 되는거야. name을 똑같이 해주고 변수를 배열로 받는거야
			ArrayList<MultipartFile> upload 이렇게 선언을 해주는 것이지
	<th>파일첨부</th> 
	<td>
		<input type="file" name="upload2" size="30">
	</td>
</tr>-->
<tr>
	<td colspan="2" class="white center">
		<input type="submit" value="저장" />
	</td> 
</tr>
</table>
</form>
</div>
</body>
</html>
