<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action 경로 앞에 /를 붙이면 절대경로 생략하면 상대경로 -->
	<form action="/student/result" method="post">
		student id : <input type="text" name="id"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>