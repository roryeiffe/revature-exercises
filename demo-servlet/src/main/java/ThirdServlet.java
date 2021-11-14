import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ThirdServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("this is a post method or my servlet");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("<h1>Get Method Called</h1>");
        pw.print(new Date().toString());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("this is a post method or my servlet");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("<h1>Post Method Called</h1>");
        pw.print(new Date().toString());
    }
}
