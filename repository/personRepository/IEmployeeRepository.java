package repository.personRepository;

import model.Person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayListEmployeeRepository();



    void addEmployeeRepository(Employee employee);

    void editEmployeeRepository(Employee employee);
}
