<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
  <title>Crear Usuario</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center">Registrar Usuario</h2>
        <form:form method="POST" action="/users/create" modelAttribute="user">
          <div class="form-group">
            <label for="name">Nombre:</label>
            <form:input path="employee.name" type="text" class="form-control" id="name"/>
          </div>
          <div class="form-group">
            <label for="lastName">Apellido:</label>
            <form:input path="employee.lastName" type="text" class="form-control" id="lastName"/>
          </div>
          <div class="form-group">
            <label for="documentType">Tipo Documento:</label>
            <form:select  path="employee.documentType" class="form-control" id="documentType">
                <form:option value="DNI">DNI</form:option>
                <form:option value="CE">CE</form:option>
                <form:option value="PASAPORTE">Pasaporte</form:option>
            </form:select>
          </div>
          <div class="form-group">
            <label for="documentNumber">Numero Documento:</label>
            <form:input path="employee.documentNumber" type="text" class="form-control" id="documentNumber"/>
          </div>
          <div class="form-group">
            <label for="phoneNumber">Telefono:</label>
            <form:input path="employee.phoneNumber" type="text" class="form-control" id="phoneNumber"/>
          </div>
          <div class="form-group">
            <label for="email">Correo:</label>
            <form:input path="employee.email" type="text" class="form-control" id="email"/>
          </div>
          <div class="form-group">
                      <label for="profession">Profesion:</label>
                      <form:input path="employee.profession" type="text" class="form-control" id="profession"/>
                    </div>
                    <div class="form-group">
                      <label for="employeeType">Tipo Empleado:</label>
                      <form:select  path="employee.employeeType" class="form-control" id="employeeType">
                         <form:option value="ADMINISTRADOR">Administrador</form:option>
                         <form:option value="VETERINARIO">Veterinario</form:option>
                         <form:option value="ASISTENTE">Asistente</form:option>
                         <form:option value="CAJERO">Cajero</form:option>
                      </form:select>
                    </div>
                    <div class="form-group">
                      <label for="admissionDate">Fecha Admision:</label>
                      <form:input path="employee.admissionDate" type="text" class="form-control" id="admissionDate"/>
          </div>
          <div class="form-group">
                      <label for="username">Usuario:</label>
                      <form:input path="username" type="text" class="form-control" id="username"/>
                    </div>
                    <div class="form-group">
                      <label for="password">password:</label>
                      <form:input path="password" type="text" class="form-control" id="password"/>
                    </div>
                    <div class="form-group">
                      <label for="userType">Tipo de Usuario:</label>
                      <form:select  path="userType" class="form-control" id="userType">
                        <form:option value="ADMINISTRADOR">Administrador</form:option>
                        <form:option value="VETERINARIO">Veterinario</form:option>
                        <form:option value="USUARIO">Usuario</form:option>
                      </form:select>
                    </div>

          <button type="submit" class="btn btn-primary btn-block">Crear Usuario</button>
        </form:form>
      </div>
    </div>
  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>