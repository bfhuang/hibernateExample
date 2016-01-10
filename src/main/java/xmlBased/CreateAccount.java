package xmlBased;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by bfhuang on 1/10/16.
 */
public class CreateAccount {


    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Account account = new Account();

        account.setAccountNumber("12");
        account.setMoney(300);

        entitymanager.persist(account);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
    }
}
