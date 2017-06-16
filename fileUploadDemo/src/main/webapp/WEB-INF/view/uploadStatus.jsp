<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
$(document).ready(function(){
	$("#img").hide();
    $("button").click(function(){
        $("#img").show();
        $("#toggle").toggle();

    });
});
</script>
</head>
<body>
	<h2 style="color: red">${fileSuccess}</h2>
	<form action="upload" method="post" enctype="multipart/form-data">
		<p>
			<input name="file" id="fileToUpload" type="file" /></a>
		<p>
			<input value="Upload" type="submit">
		</p>
	</form>
	<br>

	<c:if test="${!empty fileName}">
	<p>
		<button>
			view and Hide Uploads 
		</button>
	</p>
	<p id="toggle"><img id="img" alt="" src="getImage?name=${fileName}"></p>
	</c:if>
</body>
</html>