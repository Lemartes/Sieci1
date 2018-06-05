package ciborski.controller;

import ciborski.logika.Kalkulator;
import ciborski.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/summary")
public class ShopController extends HttpServlet {
String product1, product2, product3, product4, price1, price2, price3, price4;
Double totalPrice, averagePrice;
    Kalkulator kalkulator = new Kalkulator();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        product1 = req.getParameter("product1");
        price1 = req.getParameter("price1");
        if(!product1.isEmpty() && !price1.isEmpty()) {
            products.add(new Product(product1,Double.valueOf(price1)));
        }
        product2 = req.getParameter("product2");
        price2 = req.getParameter("price2");
        if(!product2.isEmpty() && !price2.isEmpty()) {
            products.add(new Product(product2,Double.valueOf(price2)));
        }
        product3 = req.getParameter("product3");
        price3 = req.getParameter("price3");
        if(!product3.isEmpty() && !price3.isEmpty()) {
            products.add(new Product(product3,Double.valueOf(price3)));
        }
        product4 = req.getParameter("product4");
        price4 = req.getParameter("price4");
        if(!product4.isEmpty() && !price4.isEmpty()) {
            products.add(new Product(product4,Double.valueOf(price4)));
        }

        if(products.isEmpty()) {
            resp.sendRedirect("empty.jsp");
        }else {
            totalPrice = kalkulator.total(products);
            averagePrice = kalkulator.average(products);

            req.setAttribute("products", products);
            req.setAttribute("totalPrice", totalPrice);
            req.setAttribute("averagePrice", averagePrice);
            req.getRequestDispatcher("summary.jsp").forward(req, resp);
        }
    }

}
