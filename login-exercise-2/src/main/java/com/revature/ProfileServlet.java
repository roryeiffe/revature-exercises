package com.revature;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(HTML.getNavBar());

        String name = null;
        boolean loggedIn = false;
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie cookie:cookies) {
                if(cookie.getName().equals("user_name")) {
                    name = cookie.getValue();
                }
                if(cookie.getName().equals("loggedIn")) {
                    if(cookie.getValue().equals("true")){
                        loggedIn = true;
                    }
                }
            }
        }

        if(name != null && loggedIn == true) {
            out.println("Welcome, " + name);
        }
        else{
            out.println("Please login to view profile.");
        }
    }
}
