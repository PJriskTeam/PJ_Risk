<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <style type="text/css">
	.div1
	{
		position: relative;
	}
	#t1
	{
		background-color: #00CC00;
	}
	</style>
</head>
<body>
  <h4>基本情報一覧</h4>
  <h4>メニュー</h4>
  <div class="div1" style="float:left;">
    <form action="">
      <div>
      <b>対象案件一覧</b>
        <table border="1">
          <tr>
            <td id="t1">支社</td>
            <td>
              <select>
                <option>関東支社</option>
                <option>名古屋支社</option>
                <option>群马支社</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">部門</td>
            <td>
              <select>
                <option>開発部</option>
                <option>製造部</option>
                <option>営業部</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">オータ</td>
            <td>
              <input type="text" value="" id="text2">
            </td>
          </tr>
          <tr>
            <td id="t1">顧客</td>
            <td>
              <input type="text" value="" id="text3">
            </td>
          </tr>
          <tr>
            <td id="t1">管理区分</td>
            <td>
              <input type="radio" name="A" value="A">A
              <input type="radio" name="B" value="B">B
              <input type="radio" name="すべて" checked="checked" value="すべて">すべて
            </td>
          </tr>
          <tr>
            <td id="t1">完了区分</td>
            <td>
              <input type="checkbox">
            </td>
          </tr>
        </table>
        <input type="button" value="案件登録">
        <input type="button" value="検索"><br>
      </div>
    </form>
    <form action="">
      <div>
      <b>リスク・予防管理検討会</b>
        <table border="1">
          <tr>
            <td id="t1">支社</td>
            <td>
              <select>
                <option>関東支社</option>
                <option>名古屋支社</option>
                <option>群马支社</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">部門</td>
            <td>
              <select>
                <option>開発部</option>
                <option>製造部</option>
                <option>営業部</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">プロセス</td>
            <td>
              <select>
                <option>営業</option>
                <option>購買</option>
                <option>設計・製造</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">開催日</td>
            <td>
              <select>
                <option>2018</option>
                <option>2019</option>
                <option>2020</option>
                <option selected="selected"></option>
              </select>年
              <select>
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
                <option selected="selected"></option>
              </select>月
            </td>
          </tr>
          <tr>
            <td id="t1">対象オーダ</td>
            <td>
              <input type="text" value="" id="text5">
            </td>
          </tr>
        </table>
        <input type="button" value="検索"><br>
      </div>
    </form>
    <form action="" method="post" id="form">
      <div>
      <b>品質推進会</b>
        <table border="1">
          <tr>
            <td id="t1">支社</td>
            <td>
              <select>
                <option>関東支社</option>
                <option>名古屋支社</option>
                <option>群马支社</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">部門</td>
            <td>
              <select>
                <option>開発部</option>
                <option>製造部</option>
                <option>営業部</option>
                <option selected="selected"></option>
              </select>
            </td>
          </tr>
          <tr>
            <td id="t1">開催日</td>
            <td>
              <select>
                <option>2018</option>
                <option>2019</option>
                <option>2020</option>
                <option selected="selected"></option>
              </select>年
              <select>
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
                <option selected="selected"></option>
              </select>月
            </td>
          </tr>
          <tr>
            <td id="t1">対象オーダ</td>
            <td>
              <input type="text" value="" id="text3">
            </td>
          </tr>
        </table>
        <input type="button" value="品質推進会登録">
        <input type="button" value="検索"><br>
        <input type="button" value="検索結果のCSV出力">
      </div>
    </form>
  </div>
</body>
</html>