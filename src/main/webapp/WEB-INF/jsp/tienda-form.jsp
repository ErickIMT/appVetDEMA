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
          <div class="form-group">
            <label for="nameClient">Cliente:</label>
            <form:input path="nameClient" type="text" class="form-control" id="nameClient"/>
          </div>
          <div class="form-group">
            <label for="product">Productos:</label>
              <form:select path="sales[0].product" class="form-control" id="product">
               <c:forEach var="product" items="${productList}">
                 <form:option value="${product.id}">${product.name}</form:option>
               </c:forEach>
              </form:select>
          </div>

          <button type="submit" class="btn btn-primary btn-block">Guardar Venta</button>
        </form:form>
      </div>
    </div>
  </div>

    <div class="container">
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