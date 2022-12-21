<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- C태그 쓰기 위해 넣은 taglib므로 반드시 확인 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.page{
	text-align: center;
}
</style>
<body>
	<table width="800" border="1">
		<tr>
			<td>사원번호</td>
			<td>이름</td>
			<td>직업</td>
			<td>매니저</td>
			<td>입사일</td>
			<td>월급</td>
			<td>커미션</td>
			<td>부서번호</td>
		</tr>

		<!--이때 list는 BListCommand에서 메모리에 올린 list를 뜻함. 포워딩시까지 살아있으므로-->
		<!--forEach문을 이용해 데이터를 꺼낼 수 있다.-->
		<c:forEach var="board" items="${boards}">
			<tr>
				<td>${board.empno}</td>
				<td>${board.ename}</td>
				<td>${board.job}</td>
				<td>${board.mgr}</td>
				<td>${board.hiredate}</td>
				<td>${board.sal}</td>
				<td>${board.comm}</td>
				<td>${board.deptno}</td>
			</tr>
		</c:forEach>

		<tr>
			<td colspan="8"><a href="write_view">글 작성</a></td>
		</tr>

	</table>

	<table width="800" border="1" class="page">
		<td>
			<c:if test="${pageMaker.prev}">
				<a href="list${pageMaker.makeQuery(pageMaker.startPage - 1) }">«</a>
			</c:if>
		</td>
		<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
			<td>
				<c:out value="${pageMaker.cri.pageNum == idx?'':''}" />
				<a href="list${pageMaker.makeQuery(idx)}">${idx}</a>
			</td>
		</c:forEach>
		<td>
			<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
				<a href="list${pageMaker.makeQuery(pageMaker.endPage +1) }"> » </a>
			</c:if>
		</td>
	</table>
</body>
</html>