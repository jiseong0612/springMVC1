package hello.servlet.basic.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String age = req.getParameter("age");
		System.out.println(username + ", "+ age);
		res.setContentType("text/plain");
		res.setCharacterEncoding("utf-8");
		
		System.out.println("[복수 파라미터]");
		//http://localhost/request-param?username=jiseong&age=27&username=sara
		String[] names  = req.getParameterValues("username");
		for(String name : names) {
			System.out.println("username = "+ name);
		}
		
		res.getWriter().write("OK");
	}

}
