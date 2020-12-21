<%@ page contentType="text/html; charset=UTF-8"  %>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <title>index</title>
  </head>
  <body>
    <form method="POST" action="/AgeJsp/logic">
      <input type="text" name="birthday"
                  placeholder="yyyymmdd" pattern="[0-9]{8}" required title="yyyymmdd">
      <input type="submit" value="年齢計算">

    </form>
  </body>
</html>