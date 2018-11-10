package hackday.services;

import hackday.dao.BankDao;
import hackday.entity.Bank;
import org.hibernate.Session;

public class BankService {

    private BankDao bankDao = new BankDao();

    public void save(Session session, Bank bank) throws Exception {
        bankDao.save(session, bank);
    }

    public void update(Session session, Bank bank) throws Exception {
        bankDao.update(session, bank);
    }

    public void remove(Session session, Bank bank) throws Exception {
        bankDao.remove(session, bank);
    }

    public Bank get(Session session, int id) throws Exception {
        return bankDao.get(session, id);
    }

}
