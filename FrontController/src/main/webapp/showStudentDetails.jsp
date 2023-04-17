<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
Id: <jsp:getProperty property="id" name="studentDetails"/>
Name: <jsp:getProperty property="name" name="studentDetails"/>
</body>
</html>