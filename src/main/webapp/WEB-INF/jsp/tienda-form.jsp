<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
  <title>Tienda</title>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center">Registrar Venta</h2>
        <form:form method="POST" action="/tienda/create" modelAttribute="salesDocument">
          <div class="form-group">
             <label for="salesDocumentType">Tipo de Documento:</label>
               <form:select path="salesDocumentType" class="form-control" id="salesDocumentType">
                <form:option value="BOLETA">Boleta</form:option>
                <form:option value="FACTURA">Factura</form:option>
               </form:select>
          </div>
            <label for="nameClient">Cliente:</label>
            <form:input path="nameClient" type="text" class="form-control" id="nameClient"/>
          </div>

          <button type="submit" class="btn btn-primary btn-block">Guardar Venta</button>
        </form:form>
      </div>
    </div>
  </div>

  <div class="container">
      <h2>Lista de productos</h2>

      <%-- Formulario para agregar productos --%>
      <form method="post" action="guardarProductos.jsp">
        <div class="form-group">
          <label for="nombre">Nombre del producto:</label>
          <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingrese el nombre del producto">
        </div>
        <div class="form-group">
          <label for="precio">Precio:</label>
          <input type="number" class="form-control" id="precio" name="precio" placeholder="Ingrese el precio del producto">
        </div>
        <div class="form-group">
          <label for="cantidad">Cantidad:</label>
          <input type="number" class="form-control" id="cantidad" name="cantidad" placeholder="Ingrese Cantidad del producto">
        </div>
        <button type="submit" class="btn btn-primary">Agregar</button>
      </form>

      <%-- Lista de productos agregados --%>
      <h3>Productos agregados:</h3>
      <table class="table">
        <thead>
          <tr>
            <th>Nombre</th>
            <th>Precio</th>
          </tr>
        </thead>
        <tbody>
          <%-- Recorrer la lista de productos agregados --%>
          <c:forEach var="product" items="${salesList}">
            <tr>
              <td>${producto.nombre}</td>
              <td>${producto.precio}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>