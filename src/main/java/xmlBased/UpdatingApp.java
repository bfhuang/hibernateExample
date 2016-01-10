package xmlBased;

import org.hibernate.Session;

/**
 * Created by bfhuang on 1/10/16.
 */
public class UpdatingApp {
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Account account = new Account();
        account.setMoney(100);
        account.setId(1);
        session.update(account);
        session.getTransaction().commit();
        session.close();
        System.out.println("finished adding");

    }
}
