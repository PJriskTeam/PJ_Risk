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
	#box{
		width: 90%;
		margin: 0 auto;
		overflow: hidden;
	}
	p{
		margin-top: 10px;
	}
	#nameTable{
		float: right;
	}
	.name{
		width: 100px;
		height: 20px;
		background: #ccffcc;
	}
	.txt{
		width: 100px;
		height: 20px;
		border: none;
		background: #fffacd;
	}
	.l{
		width: 170px;
		background: #ccffcc;
		margin-left: 5px;
	}
	.r{
		background: #fffacd;
	}
	#reportTbl{
		width: 100%;
	}
	.report{
		margin-right: 170px;
		margin-left: 5px;
	}
	.wid{
		width: 70%;
	}
	.process{
		margin-right: 100px;
		margin-left: 5px;
	}
	.btn{
		margin-right: 10%;
		margin-left: 80px;
		height: 40px;
		width:200px;
		margin-top:20px;
		margin-bottom: 10%;
	}
	img{
		width: 18px;
		height: 18px;
		float: right;
	}
</style>

	<!-- <script type="text/javascript" src="./jquery.js"> -->

	<script script type="text/javascript">
		function show()
		{
		    var reader = new FileReader();
		    reader.onload = function() 
		    {
		        alert(this.result)
		    }
		    var f = document.getElementById("filePicker").files[0];
		    reader.readAsText(f);
		}

	</script>
</head>
<body>
	<h4>リスク予防管理画面</h4>
	<form action="" method="post">
		<div id="box">
			<h3 style="margin-top: 20px;">◆◆◆リスク予防管理検討会開催通知兼レビュー依頼書◆◆◆</h3>
			<!-- 0. 報告区分・リスクの有無 -->
			<p style="float: left;">0.&nbsp;&nbsp;報告区分・リスクの有無</p>
				<table cellpadding="0" cellspacing="0" border="1" id="nameTable">
					<tr>
						<td class="name">起票者</td>
						<td><input type="text" class="txt"></td>
						<td class="name">最終更新者</td>
						<td><input type="text" class="txt"></td>
					</tr>
				</table>
				<br style="clear: left;">
				<table cellpadding="0" cellspacing="0" border="1" id="reportTbl">
					<tr>
						<td class="l">管理区分</td>
						<td class="r">
							<span class="report"><input type="radio" onclick="javascript:location.href='riskSort_01.jsp'">開催通知 兼 レビュー依頼書</span>
							<span class="report"><input type="radio">議事録</span>
							<span class="report"><input type="radio" onclick="javascript:location.href='riskSort_03.jsp'">リスクなしと判断</span>
						</td>
					</tr>
					<tr>
						<td class="l">確認日</td>
						<td class="r">
							<input type="text" value="2015年9月12日" style="border: 1px solid black;">（部品質管理責任者がリスクなしと判断した場合の確認日）
						</td>
					</tr>
				</table>
			<!-- 1. リスク予防管理検討会 対象工事 -->
			<p style="float: left;">1.&nbsp;&nbsp;リスク予防管理検討会 対象工事</p>
				<table cellpadding="0" cellspacing="0" border="1" id="reportTbl">
					<tr>
						<td class="l">工事名称</td>
						<td class="r">
							<input type="text" value="○○システム構築" class="wid">
						</td>
						<td class="l">顧客</td>
						<td class="r">
							<input type="text" value="三菱重工業　○○ドメイン" class="wid">
						</td>
					</tr>
					<tr>
						<td class="l">担当部門</td>
						<td class="r">
							<input type="text" value="関東支社 システム開発部 開発３グループ" class="wid">
						</td>
						<td class="l">顧客区分</td>
						<td class="r">
							<input type="text" value="三菱重工業" class="wid">
						</td>
					</tr>
					<tr>
						<td class="l">プロセス*</td>
						<td class="r" colspan="3">
							<span class="process"><input type="radio" value="">営業プロセス（原価）</span>
							<span class="process"><input type="radio" value="">営業プロセス（見積）</span>
							<span class="process"><input type="radio" value="">購買プロセス</span>
							<span class="process"><input type="radio" value="">設計・開発プロセス</span>
						</td>
					</tr>
					<tr>
						<td class="l">検討段階*</td>
						<td class="r box" colspan="3">
							<span class="process"><input type="radio" value="">引合時</span>
							<span class="process"><input type="radio" value="">受注時</span>
							<span class="process"><input type="radio" value="">基本設計完了時</span>
							<span class="process"><input type="radio" value="">詳細設計完了時</span>
						</td>
					</tr>
				</table>
			<!-- 2. リスク予防管理検討会 実施内容 -->
			<p style="float: left;">2.&nbsp;&nbsp;リスク予防管理検討会 実施内容</p>
				<table cellpadding="0" cellspacing="0" border="1" id="reportTbl">
					<tr>
						<td class="l">発信者</td>
						<td class="r" colspan="3">
							<input type="text" value="" style="width: 80%;">
						</td>
					</tr>
					<tr>
						<td class="l">開催日時
						<input type="submit" value="カレンダー" id="btn">
							<a href=""><img src="lib/pic/電話.png"></a>
						</td>
						<td class="r" colspan="3">
							<input type="date">
							<input type="text" value="10時00分～12時00分">
							<input type="text" value="(第1回目)">
						</td>
					</tr>
					<tr>
						<td class="l">開催場所</td>
						<td class="r" colspan="3">
							<input type="text" value="1号館5階501会議室" style="width: 30%;">
						</td>
					</tr>
					<tr>
						<td class="l">レビューポイント</td>
						<td class="r" style="height: 60px;" colspan="3">
							<textarea name="" id="" cols="" style="width: 80%;height: 90%;" rows="" style="vertical-align:top;outline:none;"></textarea>
						</td>
					</tr>
					<tr>
						<td class="l">レビュアー <br>（出席予定者）</td>
						<td class="r" style="height: 60px;" colspan="3">
							<textarea name="" id="" cols="" style="width: 80%;height: 90%;" rows="" style="vertical-align:top;outline:none;"></textarea>
						</td>
					</tr>
					<tr>
							<td  class="l">添付ファイル</td>
							<td class="r" style="height: 60px;" colspan="3">
							<!-- 选择文件 -->
							
<%-- 						<input type="file" id="selectFiles" οnchange="dealSelectFiles()" multiple webkitdirectory>
							<canvas id="myCanvas" width=14 height=20></canvas>
								<script type="text/javascript">
								var imgPosX = 0;
								var imgWidth = 256;
								function dealSelectFiles(){
									/// get select files.
									var selectFiles = document.getElementById("selectFiles").files;
								
									for(var file of selectFiles){
										console.log(file.webkitRelativePath);
										/// read file content.
										var reader = new FileReader();
										reader.readAsDataURL(file);
										reader.onloadend = function(){
											/// deal data.
											var img = new Image();
											/// after loader, result storage the file content result.
											img.src = this.result;	
											img.onload = function(){
												var myCanvas = document.getElementById("myCanvas");
												var cxt = myCanvas.getContext('2d');								
												cxt.drawImage(img, imgPosX, 0);
												imgPosX += imgWidth;
											}
										}
									}
								}
								</script> --%>

							<input type="file" name="file" id="filePicker" οnclick="show()" value="参照..." />
						
						</tr>
					<tr>
						<td class="l">リスク・不安要素検討表</td>
						<td class="r" style="height: 30px;">
							<input type="button" value="ダウンロード" style="margin-left: 30px;">
						</td>
						<td class="l">開催案内作成</td>
						<td class="r">
							<input type="button" value="開催案内作成" style="margin-left: 30px;">
						</td>
					</tr>
				</table>
			<!-- 3. 議事録 -->
			<p style="float: left;">3.&nbsp;&nbsp;議事録</p><br>
				<p>(1) 出席者</p>
				<table cellpadding="0" cellspacing="0" border="1" id="reportTbl">
					<tr>
						<td class="l">レビュアー<br>（出席予定者）</td>
						<td class="r" colspan="3" style="height: 30px;">
						 <textarea name="" id="" cols="" style="width: 80%;height: 90%;" rows="" style="vertical-align:top;outline:none;"></textarea>
						</td>
					</tr>
				</table>
				<p>(2) レビューコメント</p>
				<table cellpadding="0" cellspacing="0" border="1" id="reportTbl">
					<tr>
						<td class="r" colspan="3" style="height: 50px;">
						<textarea name="" id="" cols="" style="width: 80%;height: 90%;" rows="" style="vertical-align:top;outline:none;"></textarea>
						</td>
					</tr>
				</table>
				<p>(3) その他特記事項</p>
				<table cellpadding="0" cellspacing="0" border="1" id="reportTbl">
					<tr>
						<td class="r" colspan="3" style="height: 50px;">
						<textarea name="" id="" cols="" style="width: 80%;height: 90%;" rows="" style="vertical-align:top;outline:none;"></textarea>
						</td>
					</tr>
				</table>
				<input type="button" value="リスク予防検討会登録" class="btn">
				<input type="button" value="リスク予防検討会削除" class="btn">
				<input type="button" value="キャンセル" class="btn">
		</div>
	</form>
</body>
</html>