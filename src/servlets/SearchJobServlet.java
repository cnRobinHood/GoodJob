package servlets;

import entities.CompanyInfo;
import service.CompanyInfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchJobServlet extends HttpServlet {
    CompanyInfoService companyInfoService = new CompanyInfoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        List<CompanyInfo> companyInfoList;
        String keyWord = req.getParameter("keyword");
        String keywords[] = keyWord.split(" ");
        if (keywords.length == 3) {
            companyInfoList = companyInfoService.getComanyInfo(keywords[1], keywords[0], Integer.parseInt(keywords[2]));
        } else {
            companyInfoList = null;
        }
        if (companyInfoList != null) {
            req.setAttribute("companyinfo", companyInfoList);
            req.getRequestDispatcher("jobinfo.jsp").forward(req, resp);
        }

    }
}
