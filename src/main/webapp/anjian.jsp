<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 <%@page import="java.util.List"%>
<%@page import="com.hh.bean.LawCase"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
    <body>
		  <h1 align="center">案件检索结果</h1>
      <table border="1" width="100%" cellspacing="0" cellpadding="0" >
       <tr>
       <td>A01M002_SECT_NM</td>
       <td>A01M002_SECT_CD</td>
       <td>A01M002_APLSTA_YMD</td>
   
              
       </tr>
         <c:forEach items="${lawlist}" var="p">
         <tr>
      <td><c:out value="${p.a01M002_SECT_NM }"></c:out></td>
      <td><c:out value="${p.a01M002_SECT_CD }"></c:out></td>
      <td><c:out value="${p.a01M002_APLSTA_YMD }"></c:out></td>
 
         </tr>
      </c:forEach>
 
  
			</table>
		</div>
	</body>
</body>
</html>