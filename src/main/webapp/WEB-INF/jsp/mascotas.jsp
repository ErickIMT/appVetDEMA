<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Mascotas</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>

<body>

  <div class="container">
    <h2>Mascotas</h2>
    <table class="table">
        <tr>
          <th>Nombre</th>
          <th>Nacimiento</th>
          <th>Tipo</th>
          <th>Raza</th>
        </tr>
      <c:forEach var="pet" items="${petsLists}">
        <tr>
          <td>${pet.name}</td>
          <td>${cita.vet.name} ${cita.vet.lastName}</td>
          <td>${pet.birthDay}</td>
          <td>${pet.typePet}</td>
          <td>${pet.race}</td>
        </tr>
       </c:forEach>
    </table>
    <a class="nav-link" href="/mascotas/form">Crear Mascota</a>

  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>