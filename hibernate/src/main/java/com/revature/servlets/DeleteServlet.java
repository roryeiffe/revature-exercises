package com.revature.servlets;

import com.revature.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // get data from form:
        int id = Integer.parseInt(req.getParameter("id"));
        Employee employee = new Employee();
        employee.setId(id);


        // create session:
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        // delete from database:
        session.delete(employee);
        t.commit();
        session.close();

        out.println("Success! Employee deleted");
        RequestDispatcher rd = req.getRequestDispatcher("/delete.html");
        rd.include(req,resp);

    }
}
