package com.revature;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // print the nav bar:
        out.print(HTML.getNavBar());
        Cookie [] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie cookie: cookies) {
                // change logged in to false:
                if(cookie.getName().equals("loggedIn")){
                    cookie.setValue("false");
                    out.println("Logout successful!");
                    response.addCookie(cookie);
                }
            }
        }
    }
}
