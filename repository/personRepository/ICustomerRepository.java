package repository.personRepository;

import model.Person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer>displayListCustomerRepository();
    void editCustomer();

    void addNewCustomer(Customer customer);
}
