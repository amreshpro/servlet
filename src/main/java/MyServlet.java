import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public MyServlet() {
        super();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		response.getWriter().append("Served at: ").append(request.getContextPath());

        PrintWriter out = response.getWriter();
        out.println("<body style='background:blue;color:red;'>");
        out.println("<h1>Hello Amresh</h1>");
        out.println("</body>");

    }

}
