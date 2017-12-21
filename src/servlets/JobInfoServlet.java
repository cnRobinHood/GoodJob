package servlets;

import entities.CompanyInfo;
import entities.UserInfo;
import service.CompanyInfoService;
import service.UserInfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class JobInfoServlet extends HttpServlet {
    private CompanyInfoService companyInfoService = new CompanyInfoService();
    private UserInfoService userInfoService = new UserInfoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserInfo userInfo = userInfoService.getUserInfo((String) req.getSession().getAttribute("username"));
        System.out.println(userInfo.getCityIntension());
        if (userInfo != null) {
            List<CompanyInfo> companyInfoList = companyInfoService.getComanyInfo(userInfo.getJobIntension(), userInfo.getCityIntension(), Integer.parseInt(userInfo.getSalaryIntension()));
                req.setAttribute("companyinfo", companyInfoList);
                req.getRequestDispatcher("jobinfo.jsp").forward(req, resp);
            }
        }
    }

