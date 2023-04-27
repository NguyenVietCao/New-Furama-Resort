package model.Person;

public class Employee extends Person{
    //  // 2. Hệ thống quản lý còn cho phép quản lý thêm thông tin của Employee. Thông tin
    //    //Employee sẽ bao gồm: Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện
    //    //Thoại, Email, Trình độ, Vị trí, lương
    //    //Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và Sau đại học
    //    //Vị trí sẽ lưu trữ các thông tin: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám
    //    //đốc.
    private String employeeEducation;
    private String employeeLevel;
    private String employeeSalary;

    public Employee() {
    }

    public Employee(String employeeEducation, String employeeLevel, String employeeSalary) {
        this.employeeEducation = employeeEducation;
        this.employeeLevel = employeeLevel;
        this.employeeSalary = employeeSalary;
    }

    public Employee(String code, String name, String birthDay, String gender, String idNumber, String phoneNumber,
                    String email, String employeeEducation, String employeeLevel, String employeeSalary) {
        super(code, name, birthDay, gender, idNumber, phoneNumber, email);
        this.employeeEducation = employeeEducation;
        this.employeeLevel = employeeLevel;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeEducation() {
        return employeeEducation;
    }

    public void setEmployeeEducation(String employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "employeeEducation='" + employeeEducation + '\'' +
                ", employeeLevel='" + employeeLevel + '\'' +
                ", employeeSalary='" + employeeSalary + '\'' +
                '}';
    }
    public String getInformationEmployeeToCsv(){
        return getCode() +","+ getName() +","+ getBirthDay() +","+ getGender() +","+ getIdNumber() +","+ getPhoneNumber()
                +","+ getEmail() +","+ employeeEducation +","+ employeeLevel +","+ employeeSalary;
    }
}
