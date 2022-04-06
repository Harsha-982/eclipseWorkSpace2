package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k=(int) req.getAttribute("k");
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Square of a num--"+k);
		
//		res.sendRedirect("get2table?k="+k);// URL Rewriting
		
		//Session
//		HttpSession session =req.getSession();
//		session.setAttribute("k",k);
		
		//cookie
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("get2table");   
	}
}
