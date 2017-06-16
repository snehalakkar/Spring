<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red">${fileSuccess}</h2>
	<form action="upload" method="post" enctype="multipart/form-data">
		<!-- <p>
			<label for="image">Choose Image</label>
		</p> -->
		<p>
			<input name="file" id="fileToUpload" type="file" /></a>
		<p>
			<input value="Upload" type="submit">
		</p>
	</form>
	<br>
	<p>
		<button>
			<a href="display">View File</a>
		</button>
	</p>
</body>
</html>