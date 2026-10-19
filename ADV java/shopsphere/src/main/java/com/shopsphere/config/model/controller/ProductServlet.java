package com.shopsphere.controller;

import com.shopsphere.dao.ProductDAO;
import com.shopsphere.model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// Yeh URL mapping hai, jab hum /products open karenge toh yeh servlet chalega
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    private final ProductDAO productDAO = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // DAO layer se list fetch karein
        List<Product> productList = productDAO.getAllProducts();
        
        // Data ko request scope me set karein taaki JSP ise padh sake
        request.setAttribute("products", productList);
        
        // Request ko products.jsp (View) par forward kar dein
        request.getRequestDispatcher("/products.jsp").forward(request, response);
    }
}
