package com.revature.servlets;

import com.revature.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class ViewEmployees extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // set up writer:
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // initialize table:
        out.print("<table border = '1'");
        out.print("<tr><th>ID</th><th>Name</th><th>Email</th><th>Country</th><th>Gender</th>");

        // set up session:
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // query all elements from table
        Query qry = session.createQuery("from Employee e");

        // get list of records:
        List l =qry.list();

        // iterate through
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            // populate table:
            Object o = (Object)it.next();
            Employee e = (Employee)o;
            out.print("<tr>");
            out.print("<td>" + e.getId() + "</td>");
            out.print("<td>" + e.getName() + "</td>");
            out.print("<td>" + e.getEmail() + "</td>");
            out.print("<td>" + e.getCountry() + "</td>");
            out.print("<td>" + e.getGender() + "</td>");
            out.print("</tr>");
        }
        out.print("<table");

    }
}
