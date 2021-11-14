import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("Creating object...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servicing...");
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.print("<html><body>");
        pw.print("<h1>Welcome to servlet. </h1>");
        pw.print("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying servlet object...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return "this server created by admin";
    }
}
