package repository.personRepository;

import model.Person.Employee;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository implements IEmployeeRepository {
    String PATH_FILE = "/Applications/Cao_laptrinh/Cao_codegym/khac/New_Furama_Resort/data/ListEmployee.csv";
//    Employee employee = new Employee();
    static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee = new Employee("01", "quy", "12/02/2000", "nam", "0905451778", "0905451778", "phucquy@gmail.com", "university", "manager", "2000usd");
        employeeList.add(employee);
    }

    @Override
    public List<Employee> displayListEmployeeRepository() {
        List<Employee>employees = new ArrayList<>();
        List<String>stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[]arrList = stringList.get(0).split(",");
            Employee employee = new Employee(arrList[0],arrList[1],arrList[2],arrList[3],arrList[4],arrList[5],
                    arrList[6],arrList[7],arrList[8],arrList[9] );
            employees.add(employee);


        }

        return employees;
    }


    @Override
    public void addEmployeeRepository(Employee employee) {
        employeeList.add(employee);
        saveToFile(employee);
    }

    @Override
    public void editEmployeeRepository(Employee employee) {
        employeeList.set(Integer.parseInt(employee.getCode()),employee);
        saveToFile(employee);
    }

    public void saveToFile(Employee employee) {
        String str = employee.getInformationEmployeeToCsv();
        ReadAndWrite.writeFile(PATH_FILE, str, true);
    }
}
