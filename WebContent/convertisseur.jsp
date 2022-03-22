<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Convertisseur de température</title>
</head>

<body>

	 Vous pouvez convertir une température exprimée en 
	<b>Celsius</b> en une valeur exprimée en
	<b>Fahrenheit</b> ou vice et versa
	<hr />
	
	<form method="POST"
		action="${pageContext.request.contextPath}/convertisseur">
		Convertissez en: 
		 <input type="radio" id="choix_celsius" name="unit" value="c"/>
		 en Celsius 
		  <input type="radio" id="choix_fahrenheit" name="unit" value="f"/> 		  
		 ou en Fahrenheit <br> <input type="text" size="20" name="result" style="margin:10px 0px"/>
		<br />  <input type="submit" value="Convertir"  />
	</form>

	<hr />

</body>

</html>
