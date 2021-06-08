<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>AdminPage</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
  <div class="container">
    <div class="row justify-content-md-center">
      <div class="col-6" style="text-align: center;">
        <h1 style="margin:40px 0px 50px 0px;">Панель администратора!!</h1>
        <h3>Авторизация прошла успешно!</h3>
        <h3 style="margin:0px 0px 50px 0px;">Есть возможность просмотра информации о пользователях!</h3>
        <form action="userInfo" method="get">
          <button type="submit">Просмотр списка пользователей</button>
        </form>
      </div>
    </div>
  </div>
</body>
</html>
