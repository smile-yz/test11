package cn.itcast.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextDemo730")
public class ServletContextDemo730 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*servletContext对象获取
        	1. 通过request对象获取
		        request.getServletContext();
	        2. 通过HttpServlet获取
		        this.getServletContext();
        */
        //1. 通过request对象获取
        ServletContext servletContext1 = request.getServletContext();
        System.out.println("servletContext1" + servletContext1);
        //2. 通过HttpServlet获取
        ServletContext servletContext2 = this.getServletContext();
        System.out.println("servletContext2" + servletContext2);

        System.out.println(servletContext1 == servletContext2);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
