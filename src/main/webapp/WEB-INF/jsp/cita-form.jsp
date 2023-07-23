<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <title>Crear Cita</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center">Registrar Cita</h2>
        <form:form method="POST" action="/citas/create" modelAttribute="appointment">
          <div class="form-group">
            <label for="date">Fecha:</label>
            <form:input path="date" type="date" class="form-control" id="date"/>
          </div>
          <div class="form-group">
            <label for="vet">Veterinario:</label>
              <c:forEach var="vet" items="${vetList}">
                <tr>
                  <td>${cita.date}</td>
                  <td>${cita.vet.name} ${cita.vet.lastName}</td>
                  <td>${cita.pet.name}</td>
                  <td>${cita.owner[0].name} ${cita.owner.lastName}</td>
                  <td>${cita.owner[0].phoneNumber}</td>
                  <td>${cita.owner[0].address}</td>
                </tr>
               </c:forEach>
            <form:input path="vet.id" type="text" class="form-control" id="vet"/>
          </div>
          <div class="form-group">
            <label for="pet">Mascota:</label>
            <form:input path="pet.id" type="text" class="form-control" id="pet"/>
          </div>
          <div class="form-group">
            <label for="owner">Dueño:</label>
            <form:input path="owner.id" type="text" class="form-control" id="owner"/>
          </div>

          <button type="submit" class="btn btn-primary btn-block">Crear Cita</button>
        </form:form>
      </div>
    </div>
  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>