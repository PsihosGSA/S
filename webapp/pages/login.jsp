<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login page</title>
</head>
<body>

<form action="<c:url value="/login"/>" method="post">
    <input type="text" name="user" placeholder="Email">
    <input type="password" name="password" placeholder="Password">
    <input type="submit" value="submit">
</form>
</body>
</html>