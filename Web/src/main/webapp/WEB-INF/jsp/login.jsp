<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<html>
<body>
<h2>Hello please login here</h2>
<form class="loginform" action="loginsucess" method="post">
 <input class="un " name="name" type="text" align="center" placeholder="Name">
            <input class="pass" type="password" name="password" align="center" placeholder="Password">
 <button type="submit" class="sumbitlog">enter</button>
</form>
</body>
</html>
