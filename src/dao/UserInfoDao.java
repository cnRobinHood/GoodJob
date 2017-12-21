package dao;

import entities.UserInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.GetSessionFactory;

import java.util.List;

public class UserInfoDao {
    SessionFactory factory = GetSessionFactory.getFactory();

    public UserInfo getUserInfo(String username) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select userInfo from UserInfo userInfo where userInfo.username=:username";
        Query query = session.createQuery(hql);
        query.setString("username", username);
        List<UserInfo> userInfoList = query.list();
        transaction.commit();
        session.close();
        if (userInfoList.size() != 0) {
            return userInfoList.get(0);
        }
        return null;
    }

    public boolean setUserInfo(UserInfo userInfo) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(userInfo);
        transaction.commit();
        session.close();
        return true;
    }

    public boolean updateUserInfo(UserInfo userInfo) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(userInfo);
        transaction.commit();
        session.close();
        return true;
    }
}
