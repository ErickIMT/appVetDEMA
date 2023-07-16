<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
  <title>Página de inicio de sesión</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center">Iniciar sesión</h2>
        <h2 class="text-center">${message}</h2>
        <form:form method="POST" action="/login" modelAttribute="user">
          <div class="form-group">
            <label for="username">Usuario:</label>
            <form:input path="username" type="text" class="form-control" id="username" placeholder="Ingrese su nombre de usuario"/>
          </div>
          <div class="form-group">
            <label for="password">Contraseña:</label>
            <form:input path="password" type="password" class="form-control" id="password" placeholder="Ingrese su contraseña"/>
          </div>
          <button type="submit" class="btn btn-primary btn-block">Iniciar sesión</button>
        </form:form>
      </div>
    </div>
  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>