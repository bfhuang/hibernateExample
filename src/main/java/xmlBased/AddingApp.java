package xmlBased;

import org.hibernate.Session;

/**
 * Created by bfhuang on 1/10/16.
 */
public class AddingApp {
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Account account = new Account();
        account.setMoney(200);
        account.setAccountNumber("14");
        session.save(account);
        session.getTransaction().commit();
        session.close();
        System.out.println("finished adding");



    }
}
