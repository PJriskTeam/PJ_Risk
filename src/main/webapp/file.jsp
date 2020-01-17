<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 <%@page import="java.util.List"%>
<%@page import="com.hh.bean.Project"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			table tr td{
				border:1px solid #000000;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div class="div">
			<h1>案件检索画面</h1>
		</div>
		<div class="div1">
			<table border="1" width="100%" cellspacing="0" cellpadding="0" height="195">
				<tr>
					<td width="100" >案件番号</td>
					<td width="80" >プロセス</td>
					<td width="500"   >工事名称</td>
					<td width="110"  >顾客</td>
					<td width="80"   >オーだ</td>
					<td width="500"  >関連オーダ</td>
					<td width="80" >製造部門</td>
					<td width="70" >製造部门担当者</td>
					<td width="80"  >支社品质管理责任者</td>
					<td width="100" >部门品質管理责任者</td>
	
                  
        </tr>
          <c:forEach items="${list1}" var="p">
         <tr>
        <td><c:out value="${p.PROJECT_NO}"></c:out></td>
        <td><c:out value="${p.PROJECT_NAME_TEMP }"></c:out></td>
         <td><c:out value="${p.CUSTOMER_NAME }"></c:out></td>
      <td><c:out value="${p.ORDER_CD }"></c:out></td>
      <td><c:out value="${p.RELATE_ORDER_CD }"></c:out></td>
      <td><c:out value="${p.PRODUCT_SECT_NM }"></c:out></td>
      <td><c:out value="${p.PRODUCT_USER_FULLNAME }"></c:out></td>
      <td><c:out value="${p.BRANCH_QUALITY_MANAGER }"></c:out></td>
      <td><c:out value="${p.SECTION_QUALITY_MANAGER }"></c:out></td>
      <td><c:out value="${p.GROUP_QUALITY_MANAGER }"></c:out></td>
              
         </tr>
          </c:forEach>
			</table>
		</div>
	</body>
</html>
