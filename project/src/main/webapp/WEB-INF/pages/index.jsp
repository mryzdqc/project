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
<a href="add.action">新增</a>

	<table>
	<tr><td>id</td><td>名字</td><td>性别</td> <td>类别</td> <td>操作</td></tr>
	
		<c:forEach items="${list}" var="r">
		<tr>
			<td>${r.id}</td>
			<td>${r.name}</td> 
			<td>${r.sexname}</td>
			<td>${r.typename}</td>
			<td>
				<a href="edit.action?id=${r.id}">修改</a>
				<a href="delete.action?id=${r.id}">删除</a>
			</td>
		</tr>
		</c:forEach>
	
	</table>
</body>
</html>