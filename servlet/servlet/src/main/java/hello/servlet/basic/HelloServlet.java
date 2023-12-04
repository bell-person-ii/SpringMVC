package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");

        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String userName= request.getParameter("username"); // 컨트롤+알트+v 변수 생성 단축키
        System.out.println("userName = " + userName);

        response.setContentType("text/plain"); //헤더 정보
        response.setCharacterEncoding("utf-8"); // 헤더 정보
        response.getWriter().write("hello"+ userName);
    }

}
