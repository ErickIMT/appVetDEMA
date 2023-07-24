<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
  <title>Crear Dueño</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center">Registrar Dueño</h2>
        <form:form method="POST" action="/owner/create/${petId}" modelAttribute="owner">
          <div class="form-group">
            <label for="name">Nombre:</label>
            <form:input path="name" type="text" class="form-control" id="name"/>
          </div>
          <div class="form-group">
            <label for="lastName">Apellido:</label>
            <form:input path="lastName" type="text" class="form-control" id="lastName"/>
          </div>
          <div class="form-group">
            <label for="documentType">Tipo Documento:</label>
            <form:select  path="documentType" class="form-control" id="documentType">
                <form:option value="DNI">DNI</form:option>
                <form:option value="CE">CE</form:option>
                <form:option value="PASAPORTE">Pasaporte</form:option>
            </form:select>
          </div>
          <div class="form-group">
            <label for="documentNumber">Numero Documento:</label>
            <form:input path="documentNumber" type="text" class="form-control" id="documentNumber"/>
          </div>
          <div class="form-group">
            <label for="phoneNumber">Telefono:</label>
            <form:input path="phoneNumber" type="text" class="form-control" id="phoneNumber"/>
          </div>
          <div class="form-group">
            <label for="email">Correo:</label>
            <form:input path="email" type="text" class="form-control" id="email"/>
          </div>
          <div class="form-group">
            <label for="address">Dirección:</label>
            <form:input path="address" type="text" class="form-control" id="address"/>
          </div>


          <button type="submit" class="btn btn-primary btn-block">Crear Mascota</button>
        </form:form>
      </div>
    </div>
  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>