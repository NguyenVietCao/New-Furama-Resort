package model.Facility;

public abstract class Facility {
    // Các loại dịch vụ này sẽ bao có các thông tin: Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng,
    //Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ
    private String serviceCode;
    private String serviceName;
    private float useArea;
    private int rentCoast;
    private int maximumPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentCoast = rentCoast;
        this.maximumPeople = maximumPeople;
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUseArea() {
        return useArea;
    }

    public void setUseArea(float useArea) {
        this.useArea = useArea;
    }

    public int getRentCoast() {
        return rentCoast;
    }

    public void setRentCoast(int rentCoast) {
        this.rentCoast = rentCoast;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", rentCoast=" + rentCoast +
                ", maximumPeople=" + maximumPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
    public String getInformationFacilityToCsv(){
        return serviceCode + ","+ serviceName + ","+ useArea +","+ rentCoast + ","+ maximumPeople +","+ rentType;
    }
}
