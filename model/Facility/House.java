package model.Facility;

public class House extends Facility{
    //- Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.
 private String qualityRoom;
 private int floorNumber;

    public House(String qualityRoom, int floorNumber) {
        this.qualityRoom = qualityRoom;
        this.floorNumber = floorNumber;
    }

    public House(String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType, String qualityRoom, int floorNumber) {
        super(serviceCode, serviceName, useArea, rentCoast, maximumPeople, rentType);
        this.qualityRoom = qualityRoom;
        this.floorNumber = floorNumber;
    }

    public String getQualityRoom() {
        return qualityRoom;
    }

    public void setQualityRoom(String qualityRoom) {
        this.qualityRoom = qualityRoom;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "qualityRoom='" + qualityRoom + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
    public String getInformationHouseToCsv(){
        return getServiceCode() + "," + getServiceName() + ","+ getUseArea() +","+ getRentCoast() +","+ getMaximumPeople()
                + ","+ getRentType() +","+ getRentType() +","+qualityRoom +"," +floorNumber;
    }
}
