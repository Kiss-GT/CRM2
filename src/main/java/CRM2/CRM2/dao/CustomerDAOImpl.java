package CRM2.CRM2.dao;

import CRM2.CRM2.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;


@Repository
public class CustomerDAOImpl implements CustomerDAO{


    @Autowired
    private SessionFactory sessionFactory;

  /*  private org.hibernate.Session getCurrentSession() {

        return entityManagerFactory.unwrap(SessionFactory.class).openSession();
    }*/

    @Override
    @Transactional
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

        Query<Customer> query = session.createQuery("from Customer", Customer.class);

        List<Customer> customers = query.getResultList();

        return customers;
    }

    /*@PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        Customer customer = new Customer("sdffytgsr", "sraetset", "sdetsgset");
        entityManager.persist(customer);

        Query  query = entityManager.createQuery("from Customer", Customer.class);

        List<Customer> customers = query.getResultList();
        return customers;
    }*/


}
