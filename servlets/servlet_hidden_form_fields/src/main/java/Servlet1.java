import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        out.println("Welcome " + name);

        // creating a form that has inviisible text fields:
        out.println("<form action = 'Servlet2'>");
        out.println("<input type = 'hidden' name = 'uname' value = '" + name + "'/>");
        out.println("<input type = 'Submit' value = 'send' />");
        out.println("</form>");

    }
}
