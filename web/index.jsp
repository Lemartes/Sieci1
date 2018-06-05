<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Shopping</title>
  </head>
  <body>
 <h1>Shop</h1>
 <h2>Products:</h2>
  <form method="post" action="summary">
    <input type="text" name="product1" placeholder="Product1" ><input type="text" name="price1" placeholder="Price" ><br>
    <input type="text" name="product2" placeholder="Product2"><input type="text" name="price2" placeholder="Price"><br>
    <input type="text" name="product3" placeholder="Product3"><input type="text" name="price3" placeholder="Price"><br>
    <input type="text" name="product4" placeholder="Product4"><input type="text" name="price4" placeholder="Price"><br>
    <input type="submit" value="Buy">
  </form>
  </body>
</html>
