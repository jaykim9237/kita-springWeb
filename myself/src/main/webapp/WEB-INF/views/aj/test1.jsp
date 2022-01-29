<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajaxtest</title>

<script src="../resources/js/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function() {
	//버튼을 Click하면 함수 실행
	$('#bt1').on('click', bt1Click);
	$('#bt2').on('click', bt2Click);
});

//서버 호출
function bt1Click() {
	alert('bt1Click() 실행');
	
	$.ajax({
		url: 'ajaxtest1',
		type: 'post',
		dataType: 'text',
		success: output1,
		//Server 중지한 후 호출하여 에러 확인
		error: function (e) {
			alert(JSON.stringify(e));
			alert('error: ' + e.status)
		}
	});	
}

//call1() 실행 후 돌아올 함수
function output1() {
	alert("output1()로 돌아옴.");
}

//서버로 문자열 데이터 전송
//bt2버튼을 클릭했을 때 실행
function bt2Click() {
	alert("bt2Click() 실행");
	
	$.ajax({
		url: 'ajaxtest2',
		type: 'POST',
		data: {name: '홈길동'},
		dataType: 'text',
		success: function(s){
			alert(s);
			},
		error: function (e) {
			//객체로 나와서 알 수 없는거를 자바에서는 toString을 썼잖아 근데 여기서는 아래 있는 JSON.stringify(e) 
			//돌아오는 객체를 받아서 잘 보여주는 함수 
			alert(JSON.stringify(e));
			alert(e.statusText)
		}
	});
}

//call2() 실행 후 돌아올 함수
/* function output2(text) {
	alert("서버에서 가져온 문자열 : " + text); } */

</script>
</head>
<body>

<h1>[ Ajax 연습 1 ]</h1>

<p><input type="button" id="bt1" value="서버로 요청 보내기"></p>
<p><input type="button" id="bt2" value="서버로 문자열 보내기 / 받기"></p>

</body>
</html>
