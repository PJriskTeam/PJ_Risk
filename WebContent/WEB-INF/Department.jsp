<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		width:700px;
		height: 500px;
		margin: 0 auto;
		border:1px solid black;
		margin-top: 80px;
	}
	#userBox{
		width: 100%;
		height: 35px;
		background: #ccffcc;
		text-align: center;
		line-height: 35px;
		font-size: 20px;
	}
	.l{
		width: 100px;
		background: #ccffcc;
		padding-left:3px; 
	}
	.r,select{
		width: 140px;
		background: #fffacd;
		text-align: center;
		outline: none;
	}
	#tbl1{
		margin-top: 20px;
		margin-left: 48px;
	}
	input[type=button]{
		float: right;
		margin-top: 40px;
		margin-right: 40px;
		width: 90px;
		height: 25px;
		margin-left: 10px;
	}
	#table{
		margin: 0 auto;
		width: 90%;
		height: 30px;
		margin-top: 40px;
		background: white;
	}
	th{
		width: 60px;
	}
</style>
<script type="text/javascript">
	var selectOne;
	function show_sub(select){
		selectOne = select;
	}
	var selectOne1;
	function show_sub1(select){
		selectOne1 = select;
	}
	function toChange(){
		var list = selectOne;
		var list1 = selectOne1;
		location.href="${pageContext.request.contextPath}/toRiskUserList.action?ddlBranch="+list+"&ddlDept="+list1;
	}
	function getUserNum(){
		var lnk_UserCd = document.getElementsByName("lnkUserCd");
		var id;	
		for(var x=0; x<lnk_UserCd.length;x++){
			if(lnk_UserCd[x].checked){
				id = lnk_UserCd[x].value;
			}
		}
		return {id};
	}
	function toUser(){
		var userNum = getUserNum();
		var id = userNum.id;
		location.href="${pageContext.request.contextPath}/user.action?lnkUserCd="+id;
	}
</script>
</head>
<body>
	<h4>部门检索画面</h4>
		<div id="lockOne">
			<div id="userBox">ユーザー检索</div>
			<table cellpadding="0" cellspacing="0" border="1" id="tbl1">
				<tr>
					<td class="l">本支社</td>
					<td class="r">
						<select onchange="show_sub(this.options[this.options.selectedIndex].value)">
							<c:forEach items="${downList }" var="items">
								<option>${items.ddlBranch }</option>
							</c:forEach>
						</select>
					</td>
					<td class="l">部门</td>
					<td class="r">
						<select onchange="show_sub1(this.options[this.options.selectedIndex].value)">
							<c:forEach items="${downList }" var="items">
								<option>${items.ddlDept }</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="l">コード</td>
					<td class="r">
						<input type="text" name="txtUserCd">
					</td>
					<td class="l">所属名称</td>
					<td class="r">
						<input type="text" name="txtFullName">
					</td>
				</tr>	
				<input type="button" value="表示" id="btn" onclick="toChange()">			
			</table>
			
			<table cellpadding="0" cellspacing="0" border="1" id="table">
			<tr>
				<th>所属コード</th>
				<th>本支社</th>
				<th>所属名称</th>
				<th>別名</th>
			</tr>
			<c:forEach items="${gdvDepartmentList }" var="items">
				<tr>
					<td>${items.lnkSectCd}</td>
					<td>${items.lblBranch}</td>
					<td>${items.lblSectNm}</td>
					<td>${items.lblSectAlias}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>