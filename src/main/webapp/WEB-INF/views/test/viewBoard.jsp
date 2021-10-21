<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${testboard.btitle }</title>
</head>
<body>

<table>
	<tr>
		<th>글제목</th>
		<th>글내용</th>
		<th>조회수</th>
	</tr>
	<tr>
		<td>${testboard.btitle }</td>
		<td>${testboard.bcont }</td>
		<td>${testboard.bhit }</td>
	<tr>
	

</table>

</body>
</html>