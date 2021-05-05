<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="resources/css/details.css">
</head>
 <div>
 <img src="resources/images/1280px-Big_Bazaar_Logo.svg.png" alt="">
</div>
 
<body>
<h1>Welcome Please Enter  details here</h1>
 <form:form action="sumbit" method="post" modelAttribute="coustomerModel">

First Name(*):<form:input path="fname" />
<form:errors path="fname" cssClass="error"/><br>
Last Name:<form:input path="lname" /><br>
<form:errors path="lname" cssClass="error"/><br>
Age:<form:input  path="age" /><br>
Male: <form:radiobutton path="gender" value="M"/>
Female: <form:radiobutton path="gender" value="F"/><br>
Address:<form:input path="add" /><br>
Password:<form:password path="pin" /><br>
<form:errors path="pin" cssClass="error"/><br>

<form:button>Submit</form:button>



</form:form>

</body>
</html>