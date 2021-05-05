<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/loginms.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome ${msg}

<ul>
<c:forEach var="temp" items="${userModel.cart}">
<li> ${temp}</li>
</c:forEach>

</ul>

</body>
</html>