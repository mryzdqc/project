<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="index.action">
<input name="txt">
<input type="submit">
</form>

	<table>
	<tr><td>id</td><td>名字</td><td>性别</td> <td>类别</td> </tr>
	
		<c:forEach items="${list}" var="r">
		<tr><td>${r.id}</td><td>${r.name}</td> <td>${r.sexname}</td> <td>${r.typename}</td></tr>
		</c:forEach>
	
	</table>
</body>
</html>