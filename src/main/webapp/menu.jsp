<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>メニュー</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
	}
	body {
		background-color: #FFFAF0;
	}
	#box1{
		text-align: center;
		margin-top: 80px;
	}
	h3{
		margin-bottom: 20px;
		text-align: center;
	}
	input[value] {
		background-color: #C0FFFF;
		height: 15px;
		width: 120px;
		padding-left: 5px;		
	}
	select {
		height: 20px;
		width: 180px;
		background-color: #FFFACD;
	}	
	.year{
		width: 64px;
	}
	.month{
		width: 70px;
	}
	.order{
		width: 176px;
	}
	.check1{
		height: 30px;
		width: 60px;
		margin-top: 20px;
	}
	#box2{
		margin-left: 400px;
		margin-top: 60px;
		float: left;
	}
	#box3{
		margin-right: 400px;
		margin-top: 60px;	
		float: right;
	}
	input[type="text"]{
		background-color: #FFFACD;
	}
</style>
</head>
<body>
	<form action="" method="post">
		<div id="box1">
			<h3>リスク・予防管理検討会</h3>
			<p>
				<input value="支社" readonly="readonly">				
					<select id="firm1">
						<option id="opt1"></option>
					</select>		
			</p>		
			<p>
				<input value="部門" readonly="readonly">
					<select id="dept1">
						<option id="opt2"></option>
					</select>
			</p>
			<p>
				<input value="プロセス" readonly="readonly">
					<select id="process1">
						<option id="opt3"></option>
					</select>
			</p>
			<p>
				<input value="開催日" readonly="readonly">
				<select class="year" id="year1">
					<option id="optl"></option>
				</select>
				<span>年</span>
				<select class="month" id="month1">
					<option id="optr"></option>
				</select>
				<span>月</span>
			</p>
			<p>
				<input value="対象オーダ" readonly="readonly">
				<input type="text" class="order">
			</p>
			<p><button value=""class="check1" id="Btn1">検索</button></p>
		</div>
	</form>
	<form action="" method="post">
		<div id="box2">
			<h3>品質推進会</h3>
			<p>
				<input value="支社" readonly="readonly">
				<select>
					<option value=""></option>
				</select>		
			</p>		
			<p>
				<input value="部門" readonly="readonly">
				<select>
					<option value=""></option>
				</select>
			</p>
			<p>
				<input value="開催日" readonly="readonly">
				<select class="year">
					<option value=""></option>
				</select>
				<span>年</span>
				<select class="month">
					<option value=""></option>
				</select>
				<span>月</span>
			</p>
			<p>
				<input value="対象オーダ" readonly="readonly">
				<input type="text" class="order">
			</p>
			<p style="text-align: center;"><button value=""class="check1" onclick="quality()">検索</button></p>
		</div>
	</form>
	<form action="" method="post">
		<div id="box3">
			<h3>対象案件一覧</h3>
			<p>
				<input value="支社" readonly="readonly">
				<select>
					<option value=""></option>
				</select>		
			</p>		
			<p>
				<input value="部門" readonly="readonly">
				<select>
					<option value=""></option>
				</select>
			</p>			
			<p>
				<input value="オーダ" readonly="readonly">
				<input type="text" class="order">
			</p>
			<p>
				<input value="客户" readonly="readonly">
				<input type="text" class="order">
			</p>
			<p style="text-align: center;"><button value=""class="check1" onclick="listcase()">検索</button></p>
		</div>
	</form>
</body>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript">
// リスク予防管理検討会検索結果
	/*加载支社*/
	$(function(){
		$.ajax({
			type:"get",
			url:"getBranch",
			dataType:"json",
			success:function(data){
				for (var i = 0; i < data.length; i++) {
					/*创建一个option标签 */
					var option = $("<option>");
					$(option).text(data[i].amb_sect_nm);
					$("#firm1").append(option);
				}
			}
		})
	})
	/*加载部门*/
	$(function() {
		$.ajax({
			type:"get",
			url:"getDept",
			dataType:"json",
			success:function(data){
				for (var i = 0; i < data.length; i++) {
					var option = $("<option>");
					$(option).text(data[i].amb_allsect_nm);
					$("#dept1").append(option);
				}
			}
		})		
	})
	/*加载プロセス */
	$(function() {
		$.ajax({
			type:"get",
			url:"getProcess",
			dataType:"json",
			success:function(data){
				for (var i = 0; i < data.length; i++) {
					var option = $("<option>");
					$(option).text(data[i].process_name);
					$("#process1").append(option);
				}
			}
		})		
	})
	/*加载開催日の年*/
	$(function() {
		$.ajax({
			type:"get",
			url:"getPreventYear",
			dataType:"json",
			success:function(data){
				for (var i = 0; i < data.length; i++) {
					var option = $("<option>");
					$(option).text(data[i].open_date);
					$("#year1").append(option);
				}
			}
		})		
	})
	/*加载開催日の月*/
	$(function() {
		$.ajax({
			type:"get",
			url:"getPreventMonth",
			dataType:"json",
			success:function(data){
				for (var i = 0; i < data.length; i++) {
					var option = $("<option>");
					$(option).text(data[i].open_date);
					$("#month1").append(option);
				}
			}
		})		
	})
</script>
</html>