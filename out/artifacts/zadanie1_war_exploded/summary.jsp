<%@ page import="java.util.List" %>

<%@ page import="ciborski.Product" %><%--

  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    List<Product> products = (List<Product>) request.getAttribute("products");
%>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <title>Summary</title>
</head>
<body>

<h1>Summary</h1>

<table class="table table-bordered" style="width: 600px">
    <thead>
   <tr>
       <th scope="col">#</th>
       <th scope="col">Name</th>
       <th scope="col">Price</th>
   </tr>
    </thead>
    <tbody>
    <%
        for (int i = 0; i< products.size(); i++){
    %>
    <tr>
        <td><%=i+1%></td> <td><%=products.get(i).getName()%></td> <td><%=products.get(i).getPrice()%></td>
    </tr>
<%
    }
%>
    </tbody>
</table>
<h2>Total price of products: <%=request.getAttribute("totalPrice")%></h2>
<h2>Average price per product: <%=request.getAttribute("averagePrice")%></h2>
</body>
</html>
