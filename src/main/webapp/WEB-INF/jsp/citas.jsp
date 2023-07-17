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
          <th>Fecha</th>
          <th>Veterinario</th>
          <th>Mascota</th>
          <th>Dueño</th>
          <th>Telefono</th>
          <th>Direccion</th>
        </tr>
      <c:forEach var="cita" items="${citasList}">
        <tr>
          <td>${cita.date}</td>
          <td>${cita.vet.name} ${cita.vet.lastName}</td>
          <td>${cita.pet.name}</td>
          <td>${cita.owner[0].name} ${cita.owner.lastName}</td>
          <td>${cita.owner[0].phoneNumber}</td>
          <td>${cita.owner[0].address}</td>
        </tr>
       </c:forEach>
    </table>
    <a class="nav-link" href="/citas/form">Crear Cita</a>

  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>