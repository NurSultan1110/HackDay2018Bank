package hackday.dao;

import hackday.dao.impl.QueueImpl;
import hackday.entity.Queue;
import org.hibernate.Session;

public class QueueDao implements QueueImpl {

    @Override
    public void save(Session session, Queue queue) throws Exception {
        session.save(queue);
    }

    @Override
    public void update(Session session, Queue queue) throws Exception {
        session.update(queue);
    }

    @Override
    public void remove(Session session, Queue queue) throws Exception {
        session.remove(queue);
    }

    @Override
    public Queue get(Session session, int id) throws Exception {
        return session.load(Queue.class, id);
    }

}
