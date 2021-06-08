<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>LoginPage</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  <link rel="stylesheet" href="style/css/styleLogin.css">
</head>
<body>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Icon -->
    <div class="fadeIn first">
      <img src="style/img/loginImg.png" id="icon" alt="User Icon"/>
    </div>

    <!-- Login Form -->
    <form action="login" method="post">
      <input type="text" id="loginId" class="fadeIn second" name="login" placeholder="login">
      <input type="password" id="password" class="fadeIn third" name="pass" placeholder="password">
      <input type="submit" class="fadeIn fourth" value="Войти">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="https://www.youtube.com/watch?v=JoFKdjm9tV8&ab_channel=gogol%D1%8C">забыли
        пароль?</a>
    </div>

  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
</body>
</html>
