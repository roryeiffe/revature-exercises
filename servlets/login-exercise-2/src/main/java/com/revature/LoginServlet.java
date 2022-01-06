package com.revature;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(HTML.getHead());
        out.print(HTML.getNavBar());

        // get username and password:
        String username = request.getParameter("user_name");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("123")) {
            out.print(HTML.getFoot());
            RequestDispatcher rd = request.getRequestDispatcher("loginsuccess");
            rd.forward(request, response);
        }
        else {
            out.print("Sorry, invalid username and password");
            out.print(HTML.getFoot());
            RequestDispatcher rd = request.getRequestDispatcher("/login.html");
            rd.include(request,response);
        }

    }
}
