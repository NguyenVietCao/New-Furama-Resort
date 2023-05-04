package repository.facilityRepository;

import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;
import util.ReadAndWrite;

import java.util.*;

public class FacilityRepository implements IFacilityRepository{
    static String PATH_FILE = "/Applications/Cao_laptrinh/Cao_codegym/khac/New_Furama_Resort/data/ListFacility.csv";
    static  Map<Facility,Integer>facilityMap = new HashMap<>();
    static List<String>stringList = new ArrayList<>();
    static {
        House house = new House("SVHO-1234","House",35,12000,06,
                "thang","gold",3);
    }

    @Override
    public Map<Facility,Integer> displayListFacility() {
        List<String>strings = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < strings.size(); i++) {
            String [] arrFacility = strings.get(i).split(",");
            if (arrFacility[0].contains("VL")){
                Villa villa = new Villa(arrFacility[0],arrFacility[1],Integer.parseInt(arrFacility[2]),
                        Integer.parseInt(arrFacility[3]),Integer.parseInt(arrFacility[4]),arrFacility[5],
                        arrFacility[6],Integer.parseInt(arrFacility[7]));
                facilityMap.put(villa,Integer.parseInt(arrFacility[8]));
            }
            if (arrFacility[0].contains("HO")){
         // String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople,
                // String rentType, String qualityRoom, int floorNumber)
                House house = new House(arrFacility[0],arrFacility[1],Integer.parseInt(arrFacility[2]),Integer.parseInt(arrFacility[3])
                        ,Integer.parseInt(arrFacility[4]), arrFacility[5],arrFacility[6],Integer.parseInt(arrFacility[7]));
                facilityMap.put(house,Integer.parseInt(arrFacility[8]));
            }
            if ((arrFacility[0].contains("RO"))){
                // String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType, String freeService
                Room room = new Room(arrFacility[0],arrFacility[1],Integer.parseInt(arrFacility[2]),
                        Integer.parseInt(arrFacility[3]),Integer.parseInt(arrFacility[4]),arrFacility[5],arrFacility[6] );
                facilityMap.put(room,Integer.parseInt(arrFacility[7]));
            }

        }

        return facilityMap;
    }

    @Override
    public void addNewFacility() {

    }

    @Override
    public void displayListFacilityMaintenance() {

    }

    @Override
    public void addNewFacility(Villa villa) {
        facilityMap.put(villa,0);
    }

    @Override
    public void addNewFacility(House house) {
        facilityMap.put(house,0);
    }

    @Override
    public void addNewFacility(Room room) {
        facilityMap.put(room,0);
    }
}
