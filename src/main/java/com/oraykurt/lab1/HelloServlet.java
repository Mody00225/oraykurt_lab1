package com.oraykurt.lab1;
/*
 * Created by Oray Kurt
 * Date: 19-Jun-20
 * Time: 10:23 PM
 */

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class HelloServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		response.getOutputStream().print("Hello World");
	}
}