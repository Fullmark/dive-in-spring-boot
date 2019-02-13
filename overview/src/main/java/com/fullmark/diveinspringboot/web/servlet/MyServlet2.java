package com.fullmark.diveinspringboot.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 访问路径：http://localhost:8080/my/servlet2
 * 异步非阻塞
 * 需要在启动项加上这个：@ServletComponentScan(basePackages = "com.fullmark.diveinspringboot.web.servlet")
 * @author fanghuanbiao
 */
@WebServlet(urlPatterns="/my/servlet2",asyncSupported=true)
public class MyServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext=req.startAsync();
        asyncContext.start(()->{
            try {
                resp.getWriter().write("Hello World");
                asyncContext.complete();//触发完成
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        resp.getWriter().close();
    }
}
