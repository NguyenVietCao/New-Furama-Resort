package service.personService;

import model.Person.Employee;
import repository.personRepository.EmployeeRepository;
import util.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayListEmployeeService() {
        List<Employee>employeeList = employeeRepository.displayListEmployeeRepository();
        for (Employee e:employeeList) {
            System.out.println(e);
        }
     }

    @Override
    public void addEmployeeService() {
        boolean check = true;
        String code;
        do {
            System.out.print("Enter Code: ");
             code = scanner.nextLine();
             if (Regex.checkCodeEmployee(code)== true){
                 break;
             }else {
                 System.err.println("You wrong format Please enter again");
             }

        }while (check);


        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter BirthDay: ");
        String birthDay = scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Id Number: ");
        String idNumber = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String mail = scanner.nextLine();

        System.out.print("Enter Employee Education: ");
        String employeeEducation = scanner.nextLine();

        System.out.print("Enter Employee Level: ");
        String employeeLevel = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        String employeeSalary = scanner.nextLine();

        Employee employee = new Employee(code,name,birthDay,gender,idNumber,phoneNumber,mail,employeeEducation,employeeLevel,employeeSalary);
employeeRepository.addEmployeeRepository(employee);
    }

    @Override
    public void editEmployeeService() {
        List<Employee>employeeList = employeeRepository.displayListEmployeeRepository();
        for (Employee e:employeeList) {
            System.out.println(e);
        }
        System.out.println("Enter code you need to fix: ");
        String codeEdit = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (codeEdit.equals(employeeList.get(i).getCode())){
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter birthDay: ");
                String birthDay = scanner.nextLine();

                System.out.print("Enter Gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter Id Number: ");
                String idNumber = scanner.nextLine();

                System.out.print("Enter Phone Number: ");
                String phoneNumber = scanner.nextLine();

                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                System.out.print("Enter Employee Education: ");
                String employeeEducation = scanner.nextLine();

                System.out.print("Enter Employee Level: ");
                String employeeLevel = scanner.nextLine();

                System.out.print("Enter Employee Salary: ");
                String employeeSalary = scanner.nextLine();

                Employee employee = new Employee(codeEdit,name,birthDay,gender,idNumber,phoneNumber,email,employeeEducation,employeeLevel,employeeSalary);
                employeeRepository.editEmployeeRepository(employee);
            }

        }

    }
}
