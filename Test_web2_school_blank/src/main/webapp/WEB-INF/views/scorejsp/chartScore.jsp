<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 관리</title>
<script src='<c:url value="/resources/js/jquery-3.6.0.js" />'></script>
<script>
$(document).ready(function(){
	 var stclass;
	 var sub;
	var cal;
	
	 	$('stclass').on('change',function(){
		 	//전체 반이면
			if($("#stclass option:selected").val() == "" 
					&& $("#sub option:selected").val() == "" 
					&& $("#cal option:selected").val() == "cal1")
				$.ajax({
					url:"score/all_stclass",
					type:'get',
					data: {'text': text},
					dataType:"text",
					success: function (data) {
						alert(data)
						response(data)
						
					},
					error: function(){
						alert("없는 정보 입니다.");
						}//error
					})


		 	});
	 
}
</script>

</head>
<body>

	<h1>[ 성적 통계 ]</h1>
	
		<table>
		<tr>
				<th>반</th>
				<td>
				<select name="stclass" id="stclass">
					 <option value="">전체</option>
						
						<c:forEach var="list" items= "${listclass}">
						    <option value="${list.stclass}">${list.stclass}</option>
						 </c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<th>과목</th>
				<td>	
					<select name="sub" id="sub">
						<option value="">전체</option>
						 <option value="sub1">java</option>
						<option value="sub2">sql</option>
						<option value="sub3">spring</option>
					</select>				
				</td>
			</tr>
			<tr>
				<th>계산방법</th>
				<td>	
					<select name="cal" id="cal">
						 <option value="cal1">총점</option>
						<option value="cal2">평균</option>
					</select>					
				</td>
			</tr>
			<tr>
				<th>점수</th>
				<td>
					<label></label>
				</td>
			</tr>
		</table>
	
</body>
</html>
