package hackday.services;

import hackday.dao.PersonDao;
import hackday.entity.Person;
import org.hibernate.Session;

public class PersonService {

    private PersonDao personDao = new PersonDao();

    public void save(Session session, Person person) throws Exception {
        personDao.save(session, person);
    }

    public void update(Session session, Person person) throws Exception {
        personDao.update(session, person);
    }

    public void remove(Session session, Person person) throws Exception {
        personDao.remove(session, person);
    }

    public Person get(Session session, int id) throws Exception {
        return personDao.get(session, id);
    }

}
