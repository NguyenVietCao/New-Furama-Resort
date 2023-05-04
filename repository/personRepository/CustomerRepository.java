package repository.personRepository;

import model.Person.Customer;
import model.Person.Employee;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    static List<Customer>customerList = new ArrayList<>();
    String PATH_FILE = "/Applications/Cao_laptrinh/Cao_codegym/khac/New_Furama_Resort/data/ListCustomer.csv";
    @Override
    public List<Customer>displayListCustomerRepository() {
        List<Customer>customers = new ArrayList<>();
        List<String>stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
        String [] arrList = stringList.get(i).split(",");
        Customer customer = new Customer(arrList[0],arrList[1],arrList[2],arrList[3],arrList[4],arrList[5],arrList[6],arrList[7],arrList[8] );
        customers.add(customer);
        }

     return  customers;
    }

    @Override
    public void editCustomer() {

    }

    @Override
    public void addNewCustomer(Customer customer) {
        customerList.add(customer);
        customerSaveToFile(customer);
    }
    public void customerSaveToFile (Customer customer){
        String str = customer.getInformationCustomerToCsv();
        ReadAndWrite.writeFile(PATH_FILE,str,true);
    }
}
