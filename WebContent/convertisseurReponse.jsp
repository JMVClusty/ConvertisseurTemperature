<%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Résultat de la conversion</title>
 </head>
 <body>
	
     
      <c:if test="${choix =='f'}"> 
      		<p>Vous avez demandé la conversion en Fahrentheit de la valeur ${valCelsius} degrés Celsius</p>
      	 	<b>Et le résultat est: ${requestScope.temperature.fahrenheit} degrés Fahrentheit </b>!           
      </c:if> 
      
        <c:if test="${choix =='c'}">
        	<p>Vous avez demandé la conversion en Celsius de la valeur ${valFahrentheit} degrés Fahrentheit</p>
         	<b>Et le résultat est: ${requestScope.temperature.celsius} degrés Celsius </b>! 
   		</c:if>
     	
 </body>
</html>