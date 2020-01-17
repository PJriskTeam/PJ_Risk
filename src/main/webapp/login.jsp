<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<script  src="/jQuery/jquery.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Insert title here</title>

		<style type="text/css">
			table,table tr th, table tr td { border:1px solid #000000;}
	
	#green{background-color: #66CC66}
	a{font-size: 12px;
            margin: 0;
            padding: 0;}
	#henghong{
		width: 300px;
	}
	
	#id1{
		width: 300px;
	}
	#id2{
		width: 870px;
	}

		</style>
	</head>
	<h1 style="text-align:center">◆◆◆基本情報◆◆◆</h1>
	
	<div>
		<div id="対象案件一覧">
			<a>基本情報一覧</a><br><br>
			<a>メニュー</a><br><br>
			<a>対象案件一覧</a>	
			<form action="${pageContext.request.contextPath}/tologin.action" method="post" id="form">
				<table>
					<tr>
						<td id="green" width="200"><label for="txtname">支社</label></td>
						<td>
							<select name="A01M002_SECT_ALIAS" id="henghong">
								<option ></option>
							</select>
						</td>
					</tr>
					<tr>
						<td id="green"><label for="txtname"></label>部門</td>
						<td>
							<select name="部門" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>日本プロセス株式部門</option>
								<option>北海道部門</option>
								<option>東京部門</option>
								<option>奈良部門</option>
							</select>
						</td>
					</tr>
			        <tr>
			            <td id="green"><label for="txtname">オーダ</label></td>
			            <td><input type="text" id="txtname" name="A01M002_SECT_NM"/></td>
			        </tr>
			        <tr>
			            <td id="green"><label for="txtname">顧客</label></td>
			            <td><input type="text" id="txtname" name="A01M002_SECT_CD"/></td>
			        </tr>
			        <tr>
			        	<td id="green"><label for="txtname">管理区分</label></td>
				       	<td>
				       		<input type="radio"  name="KaNRi" value="A" />A
				       		<input type="radio"  name="KaNRi" value="B" />B
				       		<input type="radio"  name="KaNRi" value="すべて" />すべて
				       </td>
			        </tr>
			         <tr>
			        	<td id="green"><label for="txtname">完了区分</label></td>
			        	<td><input type="checkbox">完了も含む</td>
			        </tr>
				</table>
		
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="案件登録">&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="検索">
	
			</form>
		</div>
		<div>
			<a>リスク予防管理検討会</a><br>	
			<form action="${pageContext.request.contextPath}/toRiskResults.action" method="post" id="form">
				<table>
					<tr>
						<td id="green"  width="200"><label for="txtname">支社</label></td>
						<td>
							<select name="支社" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>日本プロセス株式会社</option>
								<option>北海道支社</option>
								<option >東京会社</option>
								<option>奈良会社</option>
							</select>
						</td>
					</tr>
					<tr>
						<td id="green"><label for="txtname">部門</label></td>
						<td>
							<select name="部門" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>日本プロセス株式部門</option>
								<option>北海道部門</option>
								<option>東京部門</option>
								<option>奈良部門</option>
							</select>
						</td>
					</tr>
			        <tr>
						<td id="green"><label for="txtname">プロセス</label></td>
						<td>
							<select name="プロセス" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>日本プロセス株式会社</option>
								<option>北海道プロセス</option>
								<option>東京プロセス</option>
								<option>奈良プロセス</option>
							</select>
						</td>
			        <tr>
						<td id="green"><label for="txtname">開催日</label></td>
						<td>
							<select name="開催日" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>平成一</option>
								<option>平成二</option>
								<option>平成三</option>
							</select>
							<a>年</a>
							<select name="開催日" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>
								<option>9</option>
								<option>10</option>
								<option>11</option>
								<option>12</option>
							</select>
							<a>月</a>
						</td>
			         <tr>
			            <td id="green"><label for="txtname">対象オーダ</label></td>
			            <td><input type="text" id="txtname" /></td>
			        </tr>
				</table>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value="検索">
			</form>
		</div>
		<div>	
			<a>品質推進会</a>	
			<form action="">
				<table>
					<tr>
						<td id="green" width="200"><label for="txtname">支社</label></td>
						<td>
							<select name="支社" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>日本プロセス株式会社</option>
								<option>北海道支社</option>
								<option >東京会社</option>
								<option>奈良会社</option>
							</select>
						</td>
					</tr>
					<tr>
						<td id="green"><label for="txtname">部門</label></td>
						<td>
							<select name="部門" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>日本プロセス株式部門</option>
								<option>北海道部門</option>
								<option>東京部門</option>
								<option>奈良部門</option>
							</select>
						</td>
					</tr>
			        <tr>
						<td id="green"><label for="txtname">開催日</label></td>
						<td>
							<select name="開催日" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>平成一</option>
								<option>平成二</option>
								<option>平成三</option>
							</select>
							<a>年度</a>
							<select name="開催日" >
								<option style="color: #b6b6b6" disabled selected></option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>
								<option>9</option>
								<option>10</option>
								<option>11</option>
								<option>12</option>
							</select>
							<a></a>
						</td>
			         <tr>
			            <td id="green"><label for="txtname">対象オーだ</label></td>
			            <td><input type="text" id="txtname" /></td>
			        </tr>
				</table>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="品質推進会">&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="検索"><br>&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="検索結果のCSV出力">
			</form>
		</div>
	</div>
</body>
	    <script type="text/javascript">
		$(function(){
			$.ajax({
				type:"get",
				url:"tolist1",
				dateType:"json",
				success:function(data){
					for(var i=0; i<data。length; i++){
					var option =$("<option>");	
					$(option)。text(data[i]。A01M002_SECT_ALIAS);
                    $("#henghong").append(option);
					}
				}
					})
			}
	
	</script> 
</html>