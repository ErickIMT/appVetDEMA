<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! List<Product> productos = new ArrayList<>(); %>
<%-- Obtener los parámetros enviados por el formulario --%>
<%
  String nombre = request.getParameter("nombre");
  String precio = request.getParameter("precio");
  int cantidad = request.getParameter("cantidad");

  if (nombre != null && precio != null) {
    Product producto = new Product(nombre, Double.parseDouble(precio));
    productos.add(producto);
  }
%>
<c:set var="productos" value="<%= productos %>" scope="request" />