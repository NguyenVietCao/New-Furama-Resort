package model.Facility;

public class Room extends Facility {

    //- Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    public Room(String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType, String freeService) {
        super(serviceCode, serviceName, useArea, rentCoast, maximumPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String getInformationRoomToCsv(){
        return getServiceCode() + "," + getServiceName() + "," + getUseArea() +","+ getRentCoast() +","+ getMaximumPeople()
                + "," + getRentType() +","+ freeService;
    }
}
