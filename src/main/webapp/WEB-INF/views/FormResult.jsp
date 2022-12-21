<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- form -->
	아이디 : ${ id } <br>
	<br>
	<!-- view (@ModelAttribute) -->
	이름 : ${ student.name }<br>
	나이 : ${ student.age } <br>
	<br>
	<!-- view2 -->
	이름 : ${ studentInformation.name }<br>
	나이 : ${ studentInformation.age } <br>
</body>
</html>