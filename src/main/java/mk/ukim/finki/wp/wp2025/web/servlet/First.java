package mk.ukim.finki.wp.wp2025.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "First", urlPatterns = {"/first"}, loadOnStartup = 1)
public class First extends HttpServlet {
    {
        System.out.println("First initialized at " + java.time.LocalDateTime.now());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet First</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet First</h1>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
    }
}
