<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <style type="text/css">

	#t2
	{
	background-color: #E0E0E0	;
	}
	.table{
	position: absolute;
	left: 280px;
	top: 125px;
	}
  </style>
</head>

<body>
	<form action="login" method="post">
	  <table border="1" width="100%" cellpadding="0" style="table-layout: fixed;" id="table">
		<tr>
		  <td id="t2">会議名称</td>
		  <td id="t2">支社</td>
		  <td id="t2">部門</td>
		  <td id="t2">対象案件オーダ</td>
		  <td id="t2">発信者</td>
		  <td id="t2">開催日時</td>
		  <td id="t2">開催場所</td>
		  <td id="t2">議事録開催済み</td>
		</tr>
		<c:forEach items="${data }" var="items">
		  <tr>
			<td><a href="riskSort_01.jsp">${items.project_no}</a></td>
			<td>${items.support_branch_id}</td>
			<td>${items.product_sect_nm}</td>
			<td>${items.process_no}</td>
			<td>${items.discuss_phase_no}</td>
			<td>${items.order_cd}</td>
			<td>${items.project_name_temp}</td>
			<td>${items.customer_name}</td>
		  </tr>
		</c:forEach>
	  </table>
	</form>
</body>
</html>