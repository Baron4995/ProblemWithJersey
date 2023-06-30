<%@page import="com.bookcab.client.BookCabClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My rest client</title>
</head>
<body>

	<h3>Client</h3>
	
	<%!
		BookCabClient client = new BookCabClient();
	%>
	
	<%= client.getPlainResponse() %>

</body>
</html>