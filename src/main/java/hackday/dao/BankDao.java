package hackday.dao;

import hackday.dao.impl.BanksImpl;
import hackday.entity.Bank;
import org.hibernate.Session;

public class BankDao implements BanksImpl {

//    @SuppressWarnings("unchecked")
    @Override
    public void save(Session session, Bank bank) throws Exception {
        session.save(bank);
    }

    @Override
    public void update(Session session, Bank bank) throws Exception {
        session.update(bank);
    }

    @Override
    public void remove(Session session, Bank bank) throws Exception {
        session.remove(bank);
    }

    @Override
    public Bank get(Session session, int id) throws Exception {
        return session.load(Bank.class, id);
    }

    @Override
    public Bank get(Session session, String name) throws Exception {
        return null;
    }
}
