<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 이렇게 불러만 주면 우리가 원하는 형식으로 나오지 않기 때문에  -->
<p>${member}</p>

<!-- 그렇게 보이지 않지만 getID로 불러온 것이야 jsp문법이야 -->
<p>ID : ${member.id} </p>
<p>비밀번호 : ${member.password}</p>
<p>이름 : ${member.name}</p>  


</body>
</html>