<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>UserInfo</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center; margin:40px 0px 50px 0px;">Информация о пользователях</h1>
<div class="container">
  <div class="row justify-content-md-center">
    <div class="col-6">
      <table class="table table-hover">
        <thead>
        <tr>
          <th>#</th>
          <th>id</th>
          <th>Имя</th>
          <th>Фамилия</th>
          <th>Возраст</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${userList}" varStatus="status">
          <tr>
            <td>${status.index + 1}</td>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.lastName}</td>
            <td>${user.age}</td>
            <td>
              <form action="updateUser" method="get">
                <input type="hidden" name="userId" value="${user.id}">
                <button type="submit">Изменить данные</button>
              </form>
            </td>
            <td>
              <form action="deleteUser" method="post">
                <input type="hidden" name="listNumber" value="${status.index}">
                <button type="submit">Удалить</button>
              </form>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
  <form action="addUser" method="get" style="text-align: center; margin-top: 30px;">
    <input type="submit" value="Добавить нового пользователя">
  </form>
</div>
</body>
</html>