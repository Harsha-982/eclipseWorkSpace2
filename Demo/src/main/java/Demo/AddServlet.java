package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//	doget,dopost are methods inside service
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		req.setAttribute("k",k);
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, res);
		
		
		
		
//		System.out.println(k);
//		PrintWriter out=res.getWriter();
//		out.print(k);
	}

}
