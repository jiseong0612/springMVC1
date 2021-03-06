package hello.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("HelloServlet.service");
		
		System.out.println(req);
		System.out.println(res);
		
		String username = req.getParameter("username");
		System.out.println(username);
		
		res.setContentType("text/pain");
		res.setCharacterEncoding("utf-8");
		res.getWriter().write("hello, "+username);
	}
}
