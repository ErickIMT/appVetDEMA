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
        <h2 class="text-center">Registrar Inventario</h2>
        <form:form method="POST" action="/inventario/create" modelAttribute="product">
          <div class="form-group">
            <label for="name">Nombre:</label>
            <form:input path="name" type="text" class="form-control" id="name"/>
          </div>
          <div class="form-group">
            <label for="price">Precio:</label>
            <form:input path="price" type="number" class="form-control" id="price"/>
          </div>
          <div class="form-group">
            <label for="quantity">Cantidad:</label>
            <form:input path="quantity" type="text" class="form-control" id="quantity"/>
          </div>

          <button type="submit" class="btn btn-primary btn-block">Crear Product</button>
        </form:form>
      </div>
    </div>
  </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>