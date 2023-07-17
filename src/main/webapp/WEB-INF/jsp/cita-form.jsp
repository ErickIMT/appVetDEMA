<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
            <form:input path="date" type="text" class="form-control" id="date"/>
          </div>
          <div class="form-group">
            <label for="vet">Veterinario:</label>
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