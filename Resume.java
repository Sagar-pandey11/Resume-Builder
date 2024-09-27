package ResumeBuilder;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submit")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Resume() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String summary = request.getParameter("area");
		String skill =  request.getParameter("skills");
		
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><h2>");
		pw.println(uname + "</h2>");
		pw.println(email);
		pw.println(phone);
		pw.println("<hr />" + summary + "<hr />");
		pw.println(skill);
		
		pw.println("</body></html>");
	}

}
