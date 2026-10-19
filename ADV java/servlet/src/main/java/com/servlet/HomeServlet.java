package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        HttpSession session = request.getSession(false);

        if (session == null ||
                session.getAttribute("username") == null) {

            response.sendRedirect("index.html");
            return;
        }

        String username = (String) session.getAttribute("username");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Home</title>");

        out.println("<style>");

        out.println("body {");
        out.println("font-family: Arial;");
        out.println("background-color: #f2f2f2;");
        out.println("text-align: center;");
        out.println("}");

        out.println(".box {");
        out.println("width: 500px;");
        out.println("margin: 100px auto;");
        out.println("padding: 30px;");
        out.println("background: white;");
        out.println("box-shadow: 0 0 10px gray;");
        out.println("border-radius: 10px;");
        out.println("}");

        out.println("a {");
        out.println("display: inline-block;");
        out.println("margin: 10px;");
        out.println("padding: 10px 20px;");
        out.println("text-decoration: none;");
        out.println("background: blue;");
        out.println("color: white;");
        out.println("border-radius: 5px;");
        out.println("}");

        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='box'>");

        out.println("<h1>Student Home</h1>");

        out.println("<h2>Welcome " + username + "</h2>");

        out.println("<hr>");

        out.println("<a href='student.html'>Student Form</a>");

        out.println("<a href='logout'>Logout</a>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}