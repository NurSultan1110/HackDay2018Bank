package hackday.dao.impl;

import hackday.entity.Queue;
import org.hibernate.Session;

public interface QueueImpl {

    void save(Session session, Queue queue) throws Exception;

    void update(Session session, Queue queue) throws Exception;

    void remove(Session session, Queue queue) throws Exception;

    Queue get(Session session, int id) throws Exception;
}
