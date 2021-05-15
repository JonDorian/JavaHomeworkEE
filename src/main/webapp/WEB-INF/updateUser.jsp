<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>UpdateUser</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <div class="row justify-content-md-center">
    <div class="col-6">
      <h1 style="margin:40px 0px 50px 0px;">Страница изменения данных пользователя</h1>
      <c:choose>
        <c:when test="${numberOfUsers < 1}">
          <h2>В списке нет пользователей, редактирование недоступно(</h2>
          <p>вернитесь назад и нажмите кнопку "Добавть нового пользователя"</p>
          <a href="userInfo">Назад</a>
        </c:when>
        <c:otherwise>
          <form action="updateUser" method="post">
            <div class="mb-3">
              <label for="inputId" class="form-label">Номер по списку</label>
              <input type="text" class="form-control" id="inputId" name="userId"
                     placeholder="Номер пользователя (нумерация от 1(единицы)).">
            </div>
            <div class="mb-3">
              <label for="inputName" class="form-label">Имя</label>
              <input type="text" class="form-control" id="inputName" name="newName"
                     placeholder="Введите новое имя пользователя.">
            </div>
            <div class="mb-3">
              <label for="inputLastName" class="form-label">Фамилия</label>
              <input type="text" class="form-control" id="inputLastName" name="newLastName"
                     placeholder="Введите фамилию">
            </div>
            <div class="mb-3">
              <label class="inputAge" for="inputAge">Возраст</label>
              <input type="text" class="form-control" id="inputAge" name="newAge" placeholder="Введите возраст">
            </div>
            <button type="submit" class="btn btn-primary">Обновить</button>
            <button type="reset" class="btn btn-primary">Очистить поля</button>
          </form>
        </c:otherwise>
      </c:choose>
    </div>
  </div>
</div>
</body>
</html>