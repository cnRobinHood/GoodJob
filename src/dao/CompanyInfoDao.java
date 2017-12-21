package dao;

import entities.CompanyInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.GetSessionFactory;

import java.util.List;

public class CompanyInfoDao {
    private SessionFactory factory = GetSessionFactory.getFactory();

    public List<CompanyInfo> getComanyInfo(String jobIntension, String cityIntension, int salary) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql =
                "select companyInfo from CompanyInfo companyInfo where companyInfo.position=:position and companyInfo.companyAddr=:city and companyInfo.salary=:salary";
        Query query = session.createQuery(hql);
        query.setString("position", jobIntension);
        query.setString("city", cityIntension);
        query.setInteger("salary", salary);
        List<CompanyInfo> companyInfoList = query.list();
        transaction.commit();
        session.close();
        if (companyInfoList != null && companyInfoList.size() != 0) {
            return companyInfoList;
        }
        return null;
    }
}
