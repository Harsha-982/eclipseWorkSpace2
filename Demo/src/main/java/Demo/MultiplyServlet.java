package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MultiplyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
//----------this is for URL Rewritting in session management we getparameter from url
		
//		int k=Integer.parseInt(req.getParameter("k"));

//----------this is for Session in Session Management 
//		HttpSession session=req.getSession();
//		int k=(int)session.getAttribute("k");
		
//---------this is for cookie
		Cookie cookies[]=req.getCookies();
		int k=0;
		for(Cookie c:cookies) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter out=res.getWriter();
		for(int i=0;i<10;i++) {
			out.println(k+" x "+i+" = "+k*i+"\n");
		}
	}
}
