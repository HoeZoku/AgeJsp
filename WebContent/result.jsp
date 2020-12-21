<%@ page contentType="text/html; charset=utf-8" %>
<html>
  <head>
    <title>result</title>
  </head>
  <body>
    あなたの年齢は満
    <%= request.getAttribute( "age" ) %>
    歳です。
  </body>
</html>