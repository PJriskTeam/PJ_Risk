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
	#lockOne{
		width:300px;
		height: 240px;
		margin: 0 auto;
		padding: 20px;
		margin-top: 80px;
	}
	#lockSecond{
		width:300px;
		height: 300px;
		margin-left: 20%;
		float: left;
		margin-right:120px;
		overflow: hidden;
	}
	#lockThird{
		width:300px;
		height: 300px;
		overflow: hidden;
	}
	.l{
		width: 100px;
		background: #ccffcc;
		padding-left:3px; 
	}
	.r,select{
		width: 200px;
		background: #fffacd;
		text-align: center;
	}
	h4{
		margin-bottom: 10px;
	}
	input[type=text]{
		background: #fffacd;
		border: none;
	}
	input[type=submit]{
		width: 80px;
		height: 26px;
		margin-left: 120px;
		margin-top: 17px;
	}
	button{
		width: 80px;
		height: 26px;
		margin-left: 120px;
		margin-top: 17px;
	}
	#box{
		width: 90%;
		height: 500px;
		margin: 0 auto;
		overflow: hidden;
	}
</style>
</head>
<body>
	<!-- リスク・予防管理検討会 -->
	<h4>メニュー</h4>
	<form action="${pageContext.request.contextPath}/toRiskResults.action" method="post" id="form">
	<div id="lockOne">
		<table cellpadding="0" cellspacing="0" border="1" id="table">
			<h4>リスク・予防管理検討会</h4>
			<tr class="tr">
				<td class="l">支社</td>
				<td class="r">
					<select>
						<option>関東支社</option>
						<option>関東支社</option>
					</select>
				</td>
			</tr>
			<tr class="tr">
				<td class="l">部门</td>
				<td class="r">
					<select>
						<option>システム開発部</option>
						<option>システム開発部</option>
					</select>
				</td>
			</tr>
			<tr class="tr">
				<td class="l">プロセス</td>
				<td class="r">
					<select>
						<option>営業P(原価)</option>
						<option>営業P(原価)</option>
					</select>
				</td>
			</tr>
			<tr class="tr">
				<td class="l">开催日</td>
				<td class="">
					<select style="width:60px;">
						<option>2019</option>
						<option>2018</option>
						<option>2017</option>
						<option>2016</option>
						<option>2015</option>
						<option>2014</option>
						<option>2013</option>
					</select>
					年&nbsp;&nbsp;&nbsp;&nbsp;
					<select style="width:60px;">
						<option>1月</option>
						<option>2月</option>
						<option>3月</option>
						<option>4月</option>
						<option>5月</option>
						<option>6月</option>
						<option>7月</option>
					</select>
					月
				</td>
			</tr>
			<tr class="tr">
				<td class="l">对象オーダ</td>
				<td class="r">
					<input type="text">
				</td>
			</tr>
		</table>
		<input type="submit" value="检索" >
	</div>
	</form>
	<!-- 下两个 -->
	<div id="box">
		<!-- 品质推进会 -->
		<form action="">
		<div id="lockSecond">
			<table cellpadding="0" cellspacing="0" border="1" id="table">
				<h4>品质推进会</h4>
					<tr class="tr">
					<td class="l">支社</td>
					<td class="r">
						<select>
							<option>111111</option>
							<option>111111</option>
							<option>111111</option>
							<option>111111</option>
						</select>
					</td>
				</tr>
				<tr class="tr">
					<td class="l">部门</td>
					<td class="r">
						<select>
							<option>${items.support_branch_id }</option>
						</select>
					</td>
				</tr>
				<tr class="tr">
					<td class="l">开催日</td>
					<td class="">
						<select style="width:60px;">
							<option>2019</option>
							<option>2018</option>
							<option>2017</option>
							<option>2016</option>
							<option>2015</option>
							<option>2014</option>
							<option>2013</option>
						</select>
						年&nbsp;&nbsp;&nbsp;&nbsp;
						<select style="width:60px;">
							<option>1月</option>
							<option>2月</option>
							<option>3月</option>
							<option>4月</option>
							<option>5月</option>
							<option>6月</option>
							<option>7月</option>
						</select>
						月
					</td>
				</tr>
				<tr class="tr">
					<td class="l">对象オーダ</td>
					<td class="r">
						<input type="text">
					</td>
				</tr>
			</table>
			<input type="submit" value="检索">
		</div>
		</form>
		<!-- 对象案件一览 -->
		<form action="">
		<div id="lockThird">
			<table cellpadding="0" cellspacing="0" border="1" id="table">
				<h4>对象案件一览</h4>
				<tr class="tr">
					<td class="l">支社</td>
					<td class="r">
						<select>
							<option>1111111</option>
							<option>2111111</option>
							<option>3111111</option>
							<option>4111111</option>
						</select>
					</td>
				</tr>
				<tr class="tr">
					<td class="l">部门</td>
					<td class="r">
						<select>
							<option>1111111</option>
							<option>2111111</option>
							<option>3111111</option>
							<option>4111111</option>
						</select>
					</td>
				</tr>
				<tr class="tr">
					<td class="l">オーダ</td>
					<td class="r">
						<input type="text">
					</td>
				</tr>
				<tr class="tr">
					<td class="l">客户</td>
					<td class="r">
						<input type="text">
					</td>
				</tr>
			</table>
			<input type="submit" value="检索">
		</div>
		</form>
	</div>
</body>
</html>