package com.fullmark.diveinspringboot.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 访问路径：http://localhost:8080/my/servlet
 * 传统servlet应用
 * 需要在启动项加上这个：@ServletComponentScan(basePackages = "com.fullmark.diveinspringboot.web.servlet")
 * @author fanghuanbiao
 */
@WebServlet(urlPatterns="/my/servlet")
public class MyServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.getWriter().write("Hello World");
       resp.getWriter().close();
    }
}
