import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // get information from submitted info:
        String fName = request.getParameter("first_name");
        String lName = request.getParameter("last_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        int age = Integer.parseInt(request.getParameter("age"));

        // print out this information to the page:
        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("<meta charset='UTF-8'>");
        out.print("<!-- Required meta tags -->");
        out.print("<meta charset='utf-8'>");
        out.print("<meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>");
        out.print("<!-- Bootstrap CSS -->");
        out.print("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css' integrity='sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn' crossorigin='anonymous'>");
        out.print("<link rel='preconnect' href='https://fonts.googleapis.com'>");
        out.print("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");
        out.print("<link href='https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap' rel='stylesheet'>");
        out.print("<style>");
        out.print("* {");
        out.print("font-family: 'Montserrat', sans-serif;");
        out.print("}");
        out.print(".form {");
        out.print("width: 50%;");
        out.print("margin: auto;");
        out.print("}");
        out.print("h1 {");
        out.print("margin-bottom: 20px;");
        out.print("}");
        out.print("tr {");
        out.print("}");
        out.print("</style>");
        out.print("<title>");
        out.print("Register");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class = 'wrapper'>");
        out.print("<form class = 'form' action = '/register' method = 'post' id = 'register'>");
        out.print("<h1>Welcome, " + fName + "</h1>");
        out.print("<table class = 'table'>");
        out.print("<tr>");
        out.print("<td>First Name</td>");
        out.print("<td>" + fName + "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Last Name</td>");
        out.print("<td>" + lName + "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Email</td>");
        out.print("<td>" + email + "</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Gender</td>");
        out.print("<td>");
        out.print(gender);
        out.print("</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Country</td>");
        out.print("<td>" + country +"</td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Age</td>");
        out.print("<td>" + age + "</td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("</form>");
        out.print("</div>");
        out.print("<script src='https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous'></script>");
        out.print("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js' integrity='sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF' crossorigin='anonymous'></script>");
        out.print("</body>");
        out.print("</html>");


    }
}
