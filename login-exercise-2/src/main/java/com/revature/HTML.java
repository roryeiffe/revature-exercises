package com.revature;

public class HTML {
    public static String getNavBar() {
        // return html code that makes the navbar:
        String navbar = "<nav>\\n\" +\n" +
                "                \"        <a href = \\\"/login.html\\\">Login</a>\\n\" +\n" +
                "                \"        <a href = \\\"/logout\\\">Logout</a>\\n\" +\n" +
                "                \"        <a href = \\\"/profile\\\">Profile</a>\\n\" +\n" +
                "                \"    </nav>";
        return navbar;
    }
}
