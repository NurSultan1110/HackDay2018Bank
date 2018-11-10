package hackday.dao.impl;

import hackday.entity.Bank;
import org.hibernate.Session;

public interface BanksImpl {

    void save(Session session, Bank bank) throws Exception;

    void update(Session session, Bank bank) throws Exception;

    void remove(Session session, Bank bank) throws Exception;

    Bank get(Session session, int id) throws Exception;

    Bank get(Session session, String name) throws Exception;

}
