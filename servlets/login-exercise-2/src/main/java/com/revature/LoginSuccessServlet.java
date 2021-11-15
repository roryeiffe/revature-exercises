package com.revature;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginSuccessServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(HTML.getNavBar());

        String name = request.getParameter("user_name");
        // update cookie to let user go to profile page:
        Cookie cookie = new Cookie("user_name", name);
        response.addCookie(cookie);
        cookie = new Cookie("loggedIn", "true");
        response.addCookie(cookie);
        out.print("You may now view your profile!");
    }
}
