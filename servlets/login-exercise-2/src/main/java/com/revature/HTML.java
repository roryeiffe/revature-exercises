package com.revature;

public class HTML {
    public static String getNavBar() {
        // return html code that makes the navbar:
        String navbar = "<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n" +
                "        <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n" +
                "            <div class=\"navbar-nav\">\n" +
                "                <a class=\"nav-item nav-link\" href=\"/login.html\">Login</a>\n" +
                "                <a class=\"nav-item nav-link\" href=\"/logout\">Logout</a>\n" +
                "                <a class=\"nav-item nav-link\" href=\"/profile\">Profile</a>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </nav>";
        return navbar;
    }

    // return the code that goes at the top of the HTML file
    // so everything up the opening body tag:
    public static String getHead() {
        String head = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n" +
                "          rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "    <title>Home</title>\n" +
                "</head>\n" +
                "<body>";
        return head;
    }

    // return the code that goes at the bottom of the HTML file
    // so everything below the main body content:
    public static String getFoot() {
        String foot = "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\"\n" +
                "        integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"\n" +
                "        integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n" +
                "</body>\n" +
                "</html>";
        return foot;

    }
}
