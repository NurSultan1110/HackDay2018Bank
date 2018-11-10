package hackday;

import hackday.entity.Bank;
import hackday.entity.Person;
import hackday.entity.Queue;
import hackday.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Bank kaspiBank = new Bank("AO KaspiBank");
        session.save(kaspiBank);
        Bank kazkom = new Bank("Kazkom");
        session.save(kazkom);

        Person coder = new Person("coder", false);
        session.save(coder);
        Person neo = new Person("neo", false);
        session.save(neo);

        Queue queue = new Queue(false, false, kaspiBank);
        session.save(queue);
        queue = new Queue(true, false, kazkom);
        session.save(queue);

//        Bron bron = new Bron(kazkom, coder, new Timestamp(System.currentTimeMillis()));
//        session.save(bron);
        transaction.commit();
        System.out.println("Successfully inserted");
        session.clear();
    }

}
