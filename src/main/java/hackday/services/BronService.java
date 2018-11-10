package hackday.services;

import hackday.dao.BronDao;
import hackday.entity.Bron;
import org.hibernate.Session;

public class BronService {

    private BronDao bronDao = new BronDao();

    public void save(Session session, Bron bron) throws Exception {
        bronDao.save(session, bron);
    }

    public void update(Session session, Bron bron) throws Exception {
        bronDao.update(session, bron);
    }

    public void remove(Session session, Bron bron) throws Exception {
        bronDao.remove(session, bron);
    }

    public Bron get(Session session, int id) throws Exception {
        return bronDao.get(session, id);
    }

}
