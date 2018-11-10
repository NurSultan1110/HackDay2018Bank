package hackday.services;

import hackday.dao.QueueDao;
import hackday.entity.Queue;
import org.hibernate.Session;

public class QueueService {

    private QueueDao queueDao = new QueueDao();

    private void save(Session session, Queue queue) throws Exception {
        queueDao.save(session, queue);
    }

    public void update(Session session, Queue queue) throws Exception {
        queueDao.update(session, queue);
    }

    public void remove(Session session, Queue queue) throws Exception {
        queueDao.remove(session, queue);
    }

    public Queue get(Session session, int id) throws Exception {
        return queueDao.get(session, id);
    }

}
