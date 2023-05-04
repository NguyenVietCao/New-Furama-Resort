package service.personService;

import model.Person.Customer;
import repository.personRepository.CustomerRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService{
    CustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayListCustomerService() {
        List<Customer>customers = customerRepository.displayListCustomerRepository();
        for (Customer c: customers) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewCustomer() {
// (String code, String name, String birthDay, String gender, String idNumber, String phoneNumber, String email,
// String customerType, String address
        System.out.print("Enter Customer code");
        String code = scanner.nextLine();

        System.out.print("Enter Customer code");
        String name = scanner.nextLine();

        System.out.print("Enter Customer code");
        String  birthDay = scanner.nextLine();

        System.out.print("Enter Customer code");
        String gender = scanner.nextLine();

        System.out.print("Enter Customer code");
        String idNumber = scanner.nextLine();

        System.out.print("Enter Customer code");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Customer code");
        String email = scanner.nextLine();

        System.out.print("Enter Customer code");
        String customerType = scanner.nextLine();

        System.out.print("Enter Customer code");
        String address= scanner.nextLine();

        Customer customer = new Customer(code,name,birthDay,gender,idNumber,phoneNumber,email,customerType,address);
        customerRepository.addNewCustomer(customer);
    }

    @Override
    public void editCustomer() {

    }
}
