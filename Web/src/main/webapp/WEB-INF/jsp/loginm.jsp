<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="resources/css/loginm.css">
</head>
 <div>
 <img src="resources/images/1280px-Big_Bazaar_Logo.svg.png" alt="">
</div>
 
<body>
<h1>welcome please login here</h1>
<form:form action="loginms" method="post" modelAttribute="userModel" cssClass="log">

Name:<form:input path="name" /><br>
Password:<form:password path="password" /><br>
Age:<form:input  path="age" /><br>
Male: <form:radiobutton path="gender" value="M"/>
Female: <form:radiobutton path="gender" value="F"/><br>
Cart:
Milk: <form:checkbox path="cart" value="Milk"/>
Sugar: <form:checkbox path="cart" value="Sugar"/>
Cream: <form:checkbox path="cart" value="Cream"/>
<form:button>Login</form:button>



</form:form>

</body>
</html>