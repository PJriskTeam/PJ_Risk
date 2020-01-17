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
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<style>
			table,table tr th, table tr td { border:1px solid #000000;}
	#tr1{background-color:#3399FF;}  
	#tr2{background-color:#3399FF;}  
	#green{background-color: #66CC66}
	a{font-size: 12px;
            margin: 0;
            padding: 0;}
	.div1 {
		position: relative;
		left: -50px;
		top:  -50px;
		}	
	.div2 {
		position: absolute;
		left: 65px;
		top: 60px;
	}	
	
	#id1{
		width: 300px;
	}
	#id2{
		width: 1100px;
	}
	.div3{
		position: absolute;
		left: 60px;
		top: 10px;
	}
	.div4{
		position: absolute;
		left:60px;
		top: 250px;
	}
	.div5 {
		position: absolute;
		left:60px;
		top: 320px;
	}	
	#lable1{
		position: absolute;
		left: 500px;
	}
	#lable2{
		position: absolute;
		left: 500px;
	}
	.div6{
		position: absolute;
		left:60px;
		top: 385px;
	}
	.div7{
		position: absolute;
		left:60px;
		top: 455px;
	}
	#id3{
		width: 870px;
		border: 0px solid ;
	}
	#lable3{
		position: absolute;
		left: 300px;
	}
	#lable4{
		position: absolute;
		left:700px;
	}
	#lable5{
		position: absolute;
		left:500px;
		}
	.div8	{
		position: absolute;
		left:60px;
		top: 840px;
	}
	.div9	{
		position: absolute;
		left:60px;
		top: 910px;
	}
	.div10 {
		position: absolute;
		left:300px;
		top: 1200px;
	}
	#lable6{
		position: absolute;
		left:300px;
		}
		</style>
	</head>
	<h1 style="text-align:left">◆◆◆基本情報◆◆◆</h1>
	<div class="div1" align="right" id="main">
		<form action="${pageContext.request.contextPath}/menu.action" method="post" id="querform">
		<table id="table1" style="color:black;">	
			<tr>
				<th id="tr1" align="center" width="250">起票者</th>
				<th><input></input></th>
				<th id="tr1" align="center" width="250">最終更新者</th>
				<th><input></input></th>
			</tr>
		</table>
		<div class="div3"><h5>1.オーだ情報</h5></div>
		<div class="div2">
			<table id="table2">
				<tr>
					<td id="green" width="200">案件番号</td>
					<td colspan="4" id="id2"><input type="text"  name="PROJECT_NO"/></td>
				</tr>
				<tr>
					<td id="green" width="200">プロセス*</td>
					<td colspan="4">
					<input type="radio"  name="KaNRi" value="見積プロセス(原価)" />見積プロセス(原価)
				    <input type="radio"  name="KaNRi" value="見積プロセス(見積)" />見積プロセス(見積)
				    <input type="radio"  name="KaNRi" value="購買プロセス" />購買プロセス
				    <input type="radio"  name="KaNRi" value="設計開発プロセス" />設計開発プロセス
					</td>
				</tr>
				<tr>
					<td id="green" width="200">工事名称(仮)*</td>
					<td colspan="4"><input type="text"  name="PROJECT_NAME_TEMP"/></td>
				</tr>
				<tr>
					<td id="green" width="200">顧客*</td>
					<td colspan="4"><input type="text"  name="CUSTOMER_NAME"/></td>
				</tr>
				<tr>
					<td id="green" width="200">オーだ*</td>
					<td colspan="2"><input type="text" name="ORDER_CD"></td>
					<td id="green" width="200"><label>関連オーだ*<label></td>
					<td colspan="2"><input type="text"  name="RELATE_ORDER_CD"/></td>
				</tr>
				<tr>
					<td id="green" width="200">顧客区分*</td>
					<td colspan="4">
						<input type="radio"  name="KaNRi" value="三菱重工" />三菱重工グル－ブ
						<input type="radio"  name="KaNRi" value="グル－ブ会社" />グル－ブ会社
						<input type="radio"  name="KaNRi" value="官庁" />官庁
						<input type="radio"  name="KaNRi" value="関連" />関連
						<input type="radio"  name="KaNRi" value="一般市中" />一般市中
					</td>
					<tr>
					<td id="green" width="200">製造部门*</td>
				
					<td colspan="2"><input type="text"  value=""/></td>
					<td id="green" width="200">製造部门担当者*</td>
				</tr>
				</tr>
			</table>
			</div>
			<div class="div4"><h5>2.支社間取引</h5></div>
				<div class="div5">
					<table id="table3">
				<tr>
					<td id="green" width="200">支社間取引の有無*</td>
					<td colspan="4" id="id2">
					<label id="lable"><input type="radio"  name="KaNRi" value="無" />無</label>
					<label id="lable1"><input type="radio"  name="KaNRi" value="有：自支社が窓口支社(営業及び製造を担当)" />有：自支社が窓口支社(営業及び製造を担当)</label><br/>
                    <label id="lable"><input type="radio"  name="KaNRi" value="有:自支社が支援支社" />有:自支社が支援支社</label>
					<label id="lable2"><input type="radio"  name="KaNRi" value="有:自支社が窓口支社(営業及のみ担当し、製造は支援支社)" />有:自支社が窓口支社(営業及のみ担当し、製造は支援支社)</label2>
					</td>
					
				</tr>
				<tr>
					<td id="green" width="200">支援支社</td>
					<td colspan="4" id="id2"><select name="支社" id="id1" >
						<option style="color: #b6b6b6" disabled selected></option>
						        <option>日本プロセス株式部門</option>
								<option>北海道部門</option>
								<option>東京部門</option>
								<option>奈良部門</option>
					</td>	
				</tr>
				</table>
				</div>	
				<div class="div6"><h1>3.リスク管理情報</h1></div>
				<div class="div7">
					<table id="table4">
					<tr>
					<td id="green" width="200">支社品质管理责任者*</td>
					<td id="id2" colspan="4"><input type="text"  value=""/></td>
					</tr>	
					<tr>
					<td id="green" width="200">部门品質管理责任者*</td>
					<td colspan="4"><input type="text"  value=""/></td>
					</tr>	
					<tr>
					<td id="green" width="200">グル－ブ品質管理责任者*</td>
					<td colspan="4"><input type="text"  value=""/></td>
					</tr>	
					<tr>
					<td id="green" width="200">プロ品質管理责任者*</td>
					<td colspan="4"><input type="text"  value=""/></td>
					</tr>
					<tr>
					<td id="green" width="200">リスク预防管理责任者*</td>
					<td colspan="4"><input type="text"  value=""/></td>
					</tr>	
					<tr>
					<td id="green" width="200">リスク预防管理对象</td>
					<td colspan="4"><input type="checkbox">500万以上<br/>
					<input type="checkbox">初品
					<label id="lable3"><select name="支社" id="id1" >
						<option style="color: #b6b6b6" disabled selected></option>
						        <option>日本プロセス株式部門</option>
								<option>北海道部門</option>
								<option>東京部門</option>
								<option>奈良部門</option></label>	
					</td>
					<td><label id="lable4" >理由:<input type="text" value=""/></label></td>
					</tr>
					<tr>
					<td id="green" width="200">リスク预防管理区分</td>
					<td colspan="6"><label id="lable"><input type="radio"  name="KaNRi" value="A:" />A:</label><br/>
					<label id="lable"><input type="radio"  name="KaNRi" value="B:" />B:</label>
					</td>
					</tr>
					<tr>
					<td id="green" width="200">添付ファイル</td>
					<td colspan="6" ><input type="text" value="" />
						<input type="submit"  value="参照..."/><br />
					    <input type="submit"  value="追加"/>
					</td>
					
					</tr>
					<tr>
					<td id="green" width="200">案件タイブ</td>
					<td colspan="6" ><label id="lable">
					<input type="radio"  name="KaNRi" value="" />システム開発改修
	             <label id="lable5"><input type="radio"  name="KaNRi" value="" />インフラ保守新规</label><br />   
					<input type="radio"  name="KaNRi" value="" />システム保守运用新规
					<label id="lable5"><input type="radio"  name="KaNRi" value="" />インフラ保守继续</label><br />
					<input type="radio"  name="KaNRi" value="" />システム保守运用继续
					<label id="lable5"><input type="radio"  name="KaNRi" value="" />机器贩卖</label><br />
					<input type="radio"  name="KaNRi" value="" />インフラ构造（运用构造）<label id="lable5">
						<input type="radio"  name="KaNRi" value="" />案件</label><br />
					</td>
					
					</tr>
					</table>
				</div>
	<div class="div8"><h1>4.リスク预防管理活动</h1></div>
	<div class="div9">
		<table border="1" width="100%" cellspacing="0" cellpadding="0" >
			<tr>
					<td id="green" width="200">プロセス</td>
					<td id="green" width="500px">リスク不安要素检讨表</td>
					<td id="green" width="50">不要</td>
					<td id="green" width="50">完了</td>
					</tr>	
				<tr>
					<td rowspan="2">営業プロセス(原価)</td>
					<td >リスク管理表&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" value="" id="id4"></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>

					
				</tr>
				<tr>
					
					<td>チェックリスト<input type="file" value="" id="id4"></td>
					
				</tr>
				<tr>
					<td rowspan="2">営業プロセス(見積)</td>
					<td >リスク管理表&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" value="" id="id4"></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				</tr>
				<tr>
					
					<td>チェックリスト<input type="file" value="" id="id4"></td>
					
				</tr>
				<tr>
					<td rowspan="2">購買プロセス</td>
					<td >リスク管理表&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" value="" id="id4"></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				</tr>
				<tr>
					
					<td>チェックリスト<input type="file" value="" id="id4"></td>
					
				</tr>
				<tr>
					<td rowspan="2">設計・開発プロセス</td>
					<td >リスク管理表&nbsp;&nbsp;&nbsp;&nbsp;<input type="file" value="" id="id4"></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				    <td rowspan="2"> <input type="checkbox" value=""/></td>
				</tr>
				<tr>
					
					<td>チェックリスト<input type="file" value="" id="id4"></td>
					
				</tr>
		</table>
	
	</div>
		
	</div>
	<div class="div10">
	<input type="submit"  value="案件登録"　/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  value="案件检索"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"  value="案件销除" onclick="del()"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="add.jsp"><input type="button"  value="キャンセル"/ ></a>
	 <!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  value="リスク预防检讨会登录"/ /> -->

	</div>

	<div>
		</form>
		</div>
	</div>
	<script type="text/javascript">
	function del(){
   alert("OK")
   document.getElementById("querform").action="${pageContext.request.contextPath}/delete.action"
	   document.getElementById("querform").submit();
	   
	}
	</script>
</body>
</html>
</body>
</html>