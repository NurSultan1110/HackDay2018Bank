package hackday.dao;

import hackday.dao.impl.PersonImpl;
import hackday.entity.Person;
import org.hibernate.Session;

public class PersonDao implements PersonImpl {
    @Override
    public void save(Session session, Person person) throws Exception {
        session.save(person);
    }

    @Override
    public void update(Session session, Person person) throws Exception {
        session.update(person);
    }

    @Override
    public void remove(Session session, Person person) throws Exception {
        session.remove(person);
    }

    @Override
    public Person get(Session session, int id) throws Exception {
        return session.load(Person.class, id);
    }
}
