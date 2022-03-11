<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적 통계</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>
<script>
$(document).ready(function() {
	//select의 값을 변경했을 때의 이벤트 처리
	$('select').on('change', function () {
		let stclass = $('#stclass').val();
		let subject = $('#subject').val();
		let calc = $('#calc').val();
		
		$.ajax({
			url: 'calc',
			type: 'post',
			data: {stclass: stclass, subject: subject, calc: calc},
			dataType: 'json',
			success: function(score) {
				$('#scoreView').html(score);
			},
			error: function() {
				alert('오류발생');
			}
		});
	});
});

</script>
<style>
h1 {
	width: 200px;
	text-align: center;
}
th {
	text-align: left;
}
</style>
</head>
<body>
<h1>[ 성적 통계 ]</h1>

<table>
	<tr>
		<td style="width:100px;">반</td>
		<td style="width:100px;">
			<select id="stclass">
				<option value="">전체 반</option>
				<option value="A">A반</option>
				<option value="B">B반</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>과목</td>
		<td>
			<select id="subject">
				<option value="">전체 과목</option>
				<option value="java">Java</option>
				<option value="sql">SQL</option>
				<option value="spring">Spring</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>계산방법</td>
		<td>
			<select id="calc">
				<option value="total">총점</option>
				<option value="avg">평균</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>점수</td>
		<td>
			<span id="scoreView" style="font-size:20px;font-weight:bold;padding:5px;"></span>
		</td>
	</tr>
</table>
</body>
</html>
