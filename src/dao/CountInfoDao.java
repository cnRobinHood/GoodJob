package dao;

import entities.CountInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.GetSessionFactory;

import java.util.List;

public class CountInfoDao {
    SessionFactory factory = GetSessionFactory.getFactory();

    public boolean addCountInfo(CountInfo countInfo) {
        if (countInfo == null) {
            return false;
        }
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select countInfo from CountInfo countInfo where countInfo.username=:username";
        Query query = session.createQuery(hql);
        query.setString("username", countInfo.getUsername());
        List<CountInfo> countInfoList = query.list();
        if (countInfoList.size() != 0) {
            return false;
        } else {
            session.save(countInfo);

        }
        transaction.commit();
        session.close();
        return true;


    }

    public CountInfo getCountInfo(String username) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "select countInfo from CountInfo countInfo where countInfo.username=:username";
        Query query = session.createQuery(hql);
        query.setString("username", username);
        List<CountInfo> countInfoList = query.list();
        if (countInfoList.size() != 0) {
            return countInfoList.get(0);
        }
        transaction.commit();
        session.close();
        return null;
    }
}
