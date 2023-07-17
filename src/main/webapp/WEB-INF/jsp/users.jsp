<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Usuarios</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>

<body>

  <div class="container">
    <h2>Usuarios</h2>
    <table class="table">
        <tr>
          <th>ID</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Tipo de documento</th>
          <th>Numero de documento</th>
          <th>Usuario</th>
          <th>Telefono</th>
          <th>Correo</th>
          <th>Profesion</th>
          <th>Tipo de Usuario</th>
        </tr>
      <c:forEach var="user" items="${usersList}">
        <tr>
          <td>${user.id}</td>
          <td>${user.employee.name}</td>
          <td>${user.employee.lastName}</td>
          <td>${user.employee.documentType}</td>
          <td>${user.employee.documentNumber}</td>
          <td>${user.username}</td>
          <td>${user.employee.phoneNumber}</td>
          <td>${user.employee.email}</td>
          <td>${user.employee.profession}</td>
          <td>${user.userType}</td>
        </tr>
       </c:forEach>
    </table>
    <a class="nav-link" href="/users/form">Crear Usuario</a>

  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>