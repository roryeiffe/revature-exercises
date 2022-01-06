import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet5 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // get the value from query string:
        String name = request.getParameter("name");

        out.println("Hello, " + name);

        HttpSession session = request.getSession();
        session.setAttribute("uname",name);

        out.println("<a href = 'Servlet6'>Click Here</a>");
        out.close();



    }


}
