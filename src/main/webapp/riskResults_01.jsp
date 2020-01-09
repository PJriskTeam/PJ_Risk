<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
	}
	body{
		background: #fffaf0;
	}
	#table{
		margin: 0 auto;
		width: 90%;
		height: 40px;
		margin-top: 40px;
		background: white;
	}
	tr,th,td{
		height: 36px;
	}
</style>
</head>
<body>
	<h4>リスク予防管理検討会検索結果画面</h4>
	<form action="">
		<table cellpadding="0" cellspacing="0" border="1" id="table">
			<tr>
				<th>案件番号</th>
				<th>支社</th>
				<th>制造部门</th>
				<th>プロセス</th>
				<th>检讨阶段</th>
				<th>オーダ</th>
				<th>工事名称</th>
				<th>客户</th>
			</tr>
			<c:forEach items="${riskList2 }" var="items">
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