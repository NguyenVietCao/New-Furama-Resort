package repository.facilityRepository;

import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;

import java.util.Map;

public interface IFacilityRepository {
    //  //1 Display list facility
    //        //2 Add new facility
    //        //3 Display list facility maintenance
    //        //4 Return main menu
    //        //- Khi chọn chức năng số 4  Booking Managerment  thì chương trình hiển thị thanh
    //        //menu con bao gồm:
   Map< Facility,Integer> displayListFacility();
    void addNewFacility();
    void displayListFacilityMaintenance();

    void addNewFacility(Villa villa);

    void addNewFacility(House house);

    void addNewFacility(Room room);
}
