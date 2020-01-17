<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	#box{
		width: 90%;
		margin: 0 auto;
		overflow: hidden;
	}
	table{border-collapse:collapse;}
	table,th, td{border: 1px solid black;}
</style>
</head>
<body>
	<h4>リスク予防管理画面</h4>
		<div id="box" >
			<h3 style="margin-top: 20px;">■リスク予防管理検討会検索結果画面</h3>
			<table>
				<thead id="table">
					<tr>
						<th width="7.1%">案件番号</th>
						<th width="8%">支社<br>（起票支社）</th>
						<th width="7.1%">製造部門</th>
						<th width="7.1%">プロセス</th>
						<th width="7.1%">検討階段</th>
						<th width="5%">オーダ</th>
						<th width="7.1%">工事名称</th>
						<th width="5%">顧客</th>
						<th width="6.5%">発信者</th>
						<th width="7.1%">開催日時</th>
						<th width="5%">回数</th>
						<th width="7.1%">開催場所</th>
						<th width="7.1%">議事録作成済み</th>				
					</tr>
				</thead>
				<tbody>
					<!-- items:Controller层集合名 -->
					<c:forEach items="${keltukaList}" var="order">
						<tr>
						<td><c:out value="${order.project_no }"></c:out></td>
							<%-- <td>${	order.project_no	 }</td> --%>
							<td>${	order.a01m002_sect_nm	 }</td>
							<td>${	order.product_sect_nm	 }</td>
							<td>${	order.process_name	 }</td>
							<td>${	order.discuss_phase_name	 }</td>
							<td>${	order.order_cd	 }</td>
							<td>${	order.a01m009_order_nm	}${	order.project_name_temp	 }</td>
							<td>${	order.a01m015_compy_nm	 }${	order.customer_name	 }</td>
							<td>${	order.sender_user_fullname	 }</td>
							<td>${	order.open_date	 }</td>
							<td>${	order.open_round	 }</td>
							<td>${	order.reviewer	 }${	order.review_remark	 }</td>
							<td>${	order.open_place	 }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
</body>
</html>