package CRM2.CRM2.dao;

import CRM2.CRM2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDAO {
    List <Customer> getCustomers();
}
