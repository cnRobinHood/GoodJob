package servlets;

import entities.CountInfo;
import service.CountInfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    CountInfoService countInfoService = new CountInfoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        CountInfo countInfo = new CountInfo();
        countInfo.setUsername(username);
        countInfo.setPassword(password);
        boolean answer = countInfoService.addCountInfo(countInfo);
        if (answer) {
            resp.sendRedirect("login.jsp");
        }
    }
}
