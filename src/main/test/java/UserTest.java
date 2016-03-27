

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.org.oa.gavrishs.dao.UserDaoImpl;
import ua.org.oa.gavrishs.model.Role;
import ua.org.oa.gavrishs.model.User;

/**
 * Created by Anna on 17.02.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:appContext.xml")
public class UserTest {
    @Autowired
    private SessionFactory sessionFactory;

    Session tmpSession;
    Transaction tmpTransaction;


    @Before
    public void setUp() throws Exception{
        tmpSession = sessionFactory.openSession();
        tmpTransaction = tmpSession.getTransaction();
    }

    @Test
    public void testAllUsers(){
        UserDaoImpl udi = new UserDaoImpl();
        udi.getAll();
    }


    @Test
    public void testCreate() {

        tmpTransaction.begin();

        User user = new User();
        user.setEmail("EBI@ebi.ee");
        user.setFirstName("Vasay");
        user.setLastName("Pupkin");
        user.setAge(19);
        user.setRole(Role.ADMIN);

        tmpSession.save(user);

        tmpTransaction.commit();

//        assertEquals(1L, user.getId());
    }

}
