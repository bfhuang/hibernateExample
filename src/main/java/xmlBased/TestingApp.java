package xmlBased;

import org.hibernate.Session;

/**
 * Created by bfhuang on 1/10/16.
 */
public class TestingApp {
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Account account = new Account();
        account.setId(3);
        session.getTransaction().commit();
        session.close();
        System.out.println("finished adding");

    }
}
