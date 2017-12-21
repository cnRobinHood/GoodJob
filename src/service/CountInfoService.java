package service;

import dao.CountInfoDao;
import entities.CountInfo;

public class CountInfoService {
    private CountInfoDao countInfoDao = new CountInfoDao();

    public boolean addCountInfo(CountInfo countInfo) {
        return countInfoDao.addCountInfo(countInfo);
    }

    public CountInfo getCountInfo(String username) {
        return countInfoDao.getCountInfo(username);
    }
}
