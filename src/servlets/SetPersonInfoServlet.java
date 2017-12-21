package servlets;

import entities.UserInfo;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import service.UserInfoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@MultipartConfig
public class SetPersonInfoServlet extends HttpServlet {
    Integer count = 0;
    private UserInfoService userInfoService = new UserInfoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        String realName = req.getParameter("realname");
        String gender = req.getParameter("sex");
        String age = req.getParameter("age");
        String school = req.getParameter("school");
        System.out.println(school);
        String eduBackground = req.getParameter("eduBackground");
        String jobIntension = req.getParameter("jobIntension");
        String salaryIntension = req.getParameter("salaryIntension");
        String cityIntension = req.getParameter("cityIntension");
        String brief = req.getParameter("brief");
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        String path = req.getSession().getServletContext().getRealPath("/") + "userImage/";
        System.out.println(path);
        fileItemFactory.setRepository(new File(path));
        Part filePart = req.getPart("photoSrc");
        try {
            InputStream in = filePart.getInputStream();
            FileOutputStream out = new FileOutputStream(new File(path, count.toString() + ".jpg"));
            count++;
            int lengeh = 0;
            byte[] bytes = new byte[512];
            while ((lengeh = in.read(bytes)) != -1) {
                out.write(bytes, 0, lengeh);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(Integer.parseInt(age));
        userInfo.setBrief(brief);
        userInfo.setCityIntension(cityIntension);
        userInfo.setEduBackground(eduBackground);
        userInfo.setGender(gender);
        userInfo.setJobIntension(jobIntension);
        userInfo.setRealname(realName);
        userInfo.setSchool(school);
        userInfo.setUsername((String) req.getSession().getAttribute("username"));
        userInfo.setSalaryIntension(salaryIntension);
        userInfo.setPhotoSrc(path + count + ".jpg");
        userInfoService.setUserInfo(userInfo);
        resp.sendRedirect("jobinfoServlet");
    }
}
