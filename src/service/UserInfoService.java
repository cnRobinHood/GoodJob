package service;

import dao.UserInfoDao;
import entities.UserInfo;

public class UserInfoService {
    private UserInfoDao userInfoDao = new UserInfoDao();

    public UserInfo getUserInfo(String username) {
        return userInfoDao.getUserInfo(username);
    }

    public boolean setUserInfo(UserInfo userInfo) {
        return userInfoDao.setUserInfo(userInfo);
    }

    public boolean updateUserInfo(UserInfo userInfo) {
        return userInfoDao.updateUserInfo(userInfo);

    }
}
