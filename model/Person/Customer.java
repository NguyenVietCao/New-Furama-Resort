package model.Person;

public class Customer extends Person{
   // , Loại khách, Địa
    //chỉ (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
    //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    //Customer phải booking để sử dụng các dịch vụ thuê Villa, House, Room và các dịch
    //vụ đi kèm, thông tin booking bao gồm: mã booking, ngày bắt đầu, ngày kết thúc, mã
    //khách hàng, tên dịch vụ, loại dịch vụ.
    //Đối với các dịch vụ thuê Villa và House thì Customer cần phải làm hợp đồng thuê với
    //Furama
    private String customerType ;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String code, String name, String birthDay, String gender, String idNumber, String phoneNumber, String email, String customerType, String address) {
        super(code, name, birthDay, gender, idNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getInformationCustomerToCsv(){
        return getCode() + ","+ getName() +","+ getBirthDay() +","+ getGender() +","+ getIdNumber() +","+ getPhoneNumber()
                +","+ getEmail() +","+ customerType +","+ address;
    }
}
