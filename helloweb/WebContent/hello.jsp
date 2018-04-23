<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<link >
</head>
<body>
Hello world
${ nom }
${ nom2 }
${ nom3 }

${todo.toString()}

${ todo.getTitle() } <!--  <=======à éviter!!!! -->
${ todo.title }		<!--  <=======à préférer!!!! -->
</body>
</html>