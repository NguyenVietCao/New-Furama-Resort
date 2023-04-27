package model.Person;

public class Person {

    //3. Hệ thống cho phép quản lý thêm thông tin của các Customer đến thuê và sử dụng
    //các dịch vụ của Furama. Thông tin của Customer bao gồm: Mã khách hàng, Họ tên, Ngày
    //sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ (resort sẽ phân
    //loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
    //Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).
    //Customer phải booking để sử dụng các dịch vụ thuê Villa, House, Room và các dịch
    //vụ đi kèm, thông tin booking bao gồm: mã booking, ngày booking, ngày bắt đầu thuê,
    //ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    //Đối với các dịch vụ thuê Villa và House thì Customer cần phải làm hợp đồng thuê với
    //Furama
    //Hợp đồng thuê sẽ bao gồm các thông tin: số hợp đồng, mã booking, số tiền cọc trước,
    private String code;
    private String name;
    private String birthDay;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String code, String name, String birthDay, String gender, String idNumber, String phoneNumber, String email) {
        this.code = code;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
