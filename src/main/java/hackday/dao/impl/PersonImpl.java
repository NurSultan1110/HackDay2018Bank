package hackday.dao.impl;

import hackday.entity.Person;
import org.hibernate.Session;

public interface PersonImpl {

    void save(Session session, Person person) throws Exception;

    void update(Session session, Person person) throws Exception;

    void remove(Session session, Person person) throws Exception;

    Person get(Session session, int id) throws Exception;

}
