package Mydetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mydetails extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		ServletContext sercntxt=getServletContext();
		String name=sercntxt.getInitParameter("name");
		String os=sercntxt.getInitParameter("Os");
		
//		ServletConfig sercnfig=getServletConfig();
//		String name=sercnfig.getInitParameter("name");
//		String os=sercnfig.getInitParameter("Os");
		
		PrintWriter out =res.getWriter();
		out.println(name+"--"+os);
	}
}
