package mk.ukim.finki.wp.wp2025.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Third", urlPatterns = {"/third"}, loadOnStartup = 3)
public class Third extends HttpServlet {
    {
        System.out.println("Third initialized at " + java.time.LocalDateTime.now());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Third</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet Third</h1>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
    }
}
