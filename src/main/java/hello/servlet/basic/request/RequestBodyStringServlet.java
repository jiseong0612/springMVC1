package hello.servlet.basic.request;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StreamUtils;
@WebServlet(name ="requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//api 방식으로 http 바디에 담겨서 들어온다. 따라서 바디의 바이트코드 값을 변환시켜 가져온다.
		ServletInputStream inputStream = req.getInputStream();
		String message = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
		System.out.println("message : " + message);
		resp.getWriter().write("OK");
	}

}
