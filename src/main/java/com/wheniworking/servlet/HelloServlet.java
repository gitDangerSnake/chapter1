package com.wheniworking.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhoudongwei
 * @version 1.0
 * @since 1.0
 */
@WebServlet("/hello") //如果这里不起作用，无法找到映射的servlet，请去查看web.xml配置头 ，删除webapp元素的属性xmlns
public class HelloServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = dateFormat.format(new Date());
		request.setAttribute("currentTime", currentTime);
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request,response);
	}
}
