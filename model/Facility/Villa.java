package model.Facility;

public class Villa extends Facility {
    // - Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi,
    //Số tầng.
    private String qualityRoom;
    private int areaPool;

    public Villa() {
    }

    public Villa(String qualityRoom, int areaPool) {
        this.qualityRoom = qualityRoom;
        this.areaPool = areaPool;
    }

    public Villa(String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType, String qualityRoom, int areaPool) {
        super(serviceCode, serviceName, useArea, rentCoast, maximumPeople, rentType);
        this.qualityRoom = qualityRoom;
        this.areaPool = areaPool;
    }

    public String getQualityRoom() {
        return qualityRoom;
    }

    public void setQualityRoom(String qualityRoom) {
        this.qualityRoom = qualityRoom;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "qualityRoom='" + qualityRoom + '\'' +
                ", areaPool=" + areaPool +
                '}';
    }
    public String getInformationVillaToCsv(){
        return getServiceCode() + ","+ getServiceName() +","+ getUseArea() +","+ getRentCoast() +","+ getMaximumPeople() +","+ getRentType()
                + qualityRoom +","+ areaPool;
    }
}
