package service;

import dao.CompanyInfoDao;
import entities.CompanyInfo;

import java.util.List;

public class CompanyInfoService {
    private CompanyInfoDao companyInfoDao = new CompanyInfoDao();

    public List<CompanyInfo> getComanyInfo(String jobIntension, String cityIntension, int salary) {
        return companyInfoDao.getComanyInfo(jobIntension, cityIntension, salary);
    }
}
