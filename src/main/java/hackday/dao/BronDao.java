package hackday.dao;

import hackday.dao.impl.BronImpl;
import hackday.entity.Bron;
import org.hibernate.Session;

public class BronDao implements BronImpl {

    @Override
    public void save(Session session, Bron bron) throws Exception {
        session.save(bron);
    }

    @Override
    public void update(Session session, Bron bron) throws Exception {
        session.update(bron);
    }

    @Override
    public void remove(Session session, Bron bron) throws Exception {
        session.remove(bron);
    }

    @Override
    public Bron get(Session session, int id) throws Exception {
        return session.load(Bron.class, id);
    }
}
