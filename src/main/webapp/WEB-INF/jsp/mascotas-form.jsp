<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
  <title>Crear Mascota</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center">Registrar Mascota</h2>
        <form:form method="POST" action="/mascotas/create" modelAttribute="pet">
          <div class="form-group">
            <label for="name">Nombre:</label>
            <form:input path="name" type="text" class="form-control" id="name"/>
          </div>
          <div class="form-group">
            <label for="birthday">Fecha Nacimiento:</label>
            <form:input path="birthDay" type="date" class="form-control" id="birthday"/>
          </div>
          <div class="form-group">
            <label for="typePet">Tipo de Mascota:</label>
                    <div class="form-group">
                      <form:select  path="typePet" class="form-control" id="typePet">
                        <form:option value="PERRO">Perro</form:option>
                        <form:option value="GATO">Gato</form:option>
                        <form:option value="AVE">Ave</form:option>
                        <form:option value="HAMSTER">Hamster</form:option>
                        <form:option value="OTRO">Otro</form:option>
                      </form:select>
                    </div>
          </div>
          <div class="form-group">
            <label for="race">Raza:</label>
            <form:input path="race" type="text" class="form-control" id="race"/>
          </div>

          <button type="submit" class="btn btn-primary btn-block">Crear Mascota</button>
        </form:form>
      </div>
    </div>
  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>