<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Can I Be a J?</title>
</head>
<body>
	<h3>J가 될 수 있을까</h3>
	<div>
		<div>
			<input type="text"><button>등록</button>
		</div>
		<div>
			<ul>
			<c:forEach items="${todoList}" var="todo">
				<li>${todo.task} - ${todo.taskDate}</li>
			</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>