package shen.test;/*
  Created by shendepu on 2018/1/23.
 */

// 导入必需的 java 库
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/showError")
// 扩展 HttpServlet 类
public class showerror extends HttpServlet {

    // 处理 GET 方法请求的方法
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // 设置错误代码和原因
        response.sendError(407, "Need authentication!!!" );
    }
    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
