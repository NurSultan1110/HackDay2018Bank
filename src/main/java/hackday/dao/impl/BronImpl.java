package hackday.dao.impl;

import hackday.entity.Bron;
import org.hibernate.Session;

public interface BronImpl {

    void save(Session session, Bron bron) throws Exception;

    void update(Session session, Bron bron) throws Exception;

    void remove(Session session, Bron bron) throws Exception;

    Bron get(Session session, int id) throws Exception;

}
