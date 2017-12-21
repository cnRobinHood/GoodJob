package servlets;

import entities.CountInfo;
import entities.UserInfo;
import service.CountInfoService;
import service.UserInfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserInfoService userInfoService = new UserInfoService();
    CountInfoService countInfoService = new CountInfoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        CountInfo countInfo = countInfoService.getCountInfo(username);
        UserInfo userInfo = userInfoService.getUserInfo(username);
        if (countInfo != null) {
            //System.out.println(countInfo.getPassword());
            if (countInfo.getPassword().equals(password)) {
                req.setAttribute("username", countInfo.getUsername());
                req.getSession().setAttribute("username", username);
                if (userInfo == null) {
                    req.getRequestDispatcher("/personcenter.jsp").forward(req, resp);
                } else {
                    req.getRequestDispatcher("jobinfoServlet").forward(req, resp);

                }
            } else {
                resp.setCharacterEncoding("utf8");
                resp.getOutputStream().print("密码错误");
            }
        }
    }
}
