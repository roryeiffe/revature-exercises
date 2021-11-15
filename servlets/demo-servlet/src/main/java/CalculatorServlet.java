import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // get data from input:
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));

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
        out.print(".wrapper {");
        out.print("width: 25%;");
        out.print("margin: auto;");
        out.print("margin-top: 100px;");
        out.print("}");
        out.print("</style>");
        out.print("<title>");
        out.print("Result");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class = 'wrapper'>");
        out.print("<div class='card' style='width: 18rem;'>");
        out.print("<img src='https://media1.giphy.com/media/l3fZLMbuCOqJ82gec/giphy.gif?cid=ecf05e47v9kvhtf4oqvtpie94t590vfxrtq001p88xdif7mp&rid=giphy.gif&ct=g' class='card-img-top' alt='...'>");
        out.print("<div class='card-body'>");
        out.print("<h5 class='card-title'>Result</h5>");
        out.print("<p class='card-text'>");
        // based on operation, return the correct result (add, subtract, multiply, divide):
        String operation = request.getParameter("op");
        if(operation.equals("+")) {
            out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if(operation.equals("-")){
            out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if(operation.equals("*")){
            out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if(operation.equals("/")){
            out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        out.print("</p>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("<script src='https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js' integrity='sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj' crossorigin='anonymous'></script>");
        out.print("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js' integrity='sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF' crossorigin='anonymous'></script>");
        out.print("</body>");
        out.print("</html>");



    }
}
