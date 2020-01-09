<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <style type="text/css">
    #menu
    {
    text-align:left;
    width: 20%;
    }
    
    #t1
    {
    background-color: #00CC00;
    }
    .div2{
    position: absolute;
    left: 280px;
    top: 125px;
    } 
    .btn{
        margin-right: 10%;
        margin-left: 80px;
        height: 40px;
        width:200px;
        margin-top:20px;
        margin-bottom: 10%;
    }
  </style>
</head>

<body>
<form action="login" method="post">
  <h1 align="center">◆◆◆ 品質推進会 開催通知 ◆◆◆</h1>
  <div>
    <table align="right" border="1">
      <tr>
        <td id="t1">起票者</td>
        <td>
          <input type="text" value="kds test" id="test">
        </td>
        <td id="t1">最终更新者</td>
        <td>
          <input type="text" value="" id="test1">
        </td>
      </tr>
    </table>

    <div class="div2">
      <b>0. 報告区分</b>
      <table border="1" width="100%" cellpadding="0" style="table-layout: fixed;">
        <tr>
          <td id="t1" width="15%">報告区分</td>
          <td colspan="3">
            <input type="radio" name="開催通知" value="開催通知">開催通知
            <input type="radio" name="議事録" value="議事録">議事録
          </td>
        </tr>
      </table>
      <b>1. 品質推進会 実施部門</b>
      <table border="1" width="100%" cellpadding="0" style="table-layout: fixed;">
        <tr>
          <td id="t1" width="15%">支社名</td>
          <td width="35%">
            <input type="text">
          </td>
          <td id="t1" width="15%">対象部門</td>
          <td width="35%">
            <input type="text">
          </td>
        </tr>
        <tr>
          <td id="t1">開催担当者</td>
          <td>
            <input type="text">
          </td>
          <td id="t1">会議名</td>
          <td>
            <input type="text">
          </td>
        </tr>
      </table><br>
      <b>2. 品質推進会 実施内容</b>
      <table border="1" width="100%" cellpadding="0" style="table-layout: fixed;">
        <tr>
          <td id="t1" width="17%">発信者</td>
          <td colspan="3">
            <input type="text">
          </td>
        </tr>
        <tr>
          <td id="t1">開催日時</td>
          <td colspan="3">
            <input type="text">
            <input type="text">
            <input type="text">
          </td>
        </tr>
        <tr>
          <td id="t1">開催場所</td>
          <td colspan="3">
            <input type="text">
          </td>
        </tr>
        <tr>
          <td id="t1" rowspan="3">リスクフォロー<br>対象案件</td>
          <td colspan="3">
            <input type="text" id="t1" value="案件番号">
            <input type="text" id="t1" value="工事名称">
            <input type="text" id="t1" value="担当部門">
            <input type="text" id="t1" value="担当者">
            <input type="text" id="t1" value="プロセス">
            <input type="text" id="t1" value="検討表">
          </td>
        </tr>
        <tr>
          <td colspan="3">
            <input type="text">
            <input type="text">
            <input type="text">
            <input type="text">
            <input type="text">
            <input type="button" value="DL">
          </td>
        </tr>
        <tr>
          <td colspan="3">
            <input type="text">
            <input type="text">
            <input type="text">
            <input type="text">
            <input type="text">
            <input type="button" value="DL">
          </td>
        </tr>
        <tr>
          <td id="t1">レビューポイント</td>
          <td colspan="3" style="height: 30px;" >
            <input type="text" style="width: 80%;height: 90%;">
          </td>
        </tr>
        <tr>
          <td id="t1">レビュアー<br>（出席予定者）</td>
          <td colspan="3" style="height: 30px;">
            <input type="text" style="width: 80%;height: 90%;">
          </td>
        </tr>
        <tr>
          <td id="t1" rowspan="2">添付ファイル</td>
          <td colspan="2" style="height: 30px;">
            <input type="text" style="width: 99%;height: 90%;">
          </td>
          <td>
            <input type="submit" value="参照...">
          </td>
        </tr>
        <tr>
          <td colspan="3">
            <input type="submit" value="追加">
          </td>
        </tr>
        <tr>
          <td id="t1">開催案内作成</td>
          <td colspan="3">
            <input type="submit" value="開催案内">
          </td>
        </tr>
      </table><br>
      <b>3. 議事録</b><br>
      <b>&nbsp;&nbsp;(1) 出席者</b>
        <table border="1" width="100%" cellpadding="0" style="table-layout: fixed;">
          <tr>
            <td id="t1" width="17%">レビュアー <br>（出席者）</td>
            <td colspan="3" style="height: 30px;" >
              <input type="text" style="width: 80%;height: 90%;">
            </td>
          </tr>
        </table>
      <b>&nbsp;&nbsp;(2) 議事内容</b><br>
      <table border="1" width="100%" cellpadding="0" style="table-layout: fixed;">
        <tr>
          <td colspan="3" style="height: 400px;">
            <input type="text" style="width: 100%;height: 100%;padding: 2px;">
          </td>
        </tr>
      </table>
      <input type="button" value="品質推進会議登録" class="btn">
      <input type="button" value="品質推進会議削除" class="btn">
      <input type="button" value="キャンセル" class="btn">
    </div>
  </div>
</form>
</body>
</html>
