package service.facilityService;

import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;
import repository.facilityRepository.FacilityRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    FacilityRepository facilityRepository = new FacilityRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayListFacility() {
        Map<Facility, Integer> facilityIntegerMap = facilityRepository.displayListFacility();
        Set<Facility> set = facilityIntegerMap.keySet();
        for (Facility f : set) {
            System.out.println(f + ":" + facilityIntegerMap.get(f));
        }


    }

    @Override
    public void addNewFacility() {
        boolean check = true;
        do {
            System.out.println("----Add New Facility---- \n" +
                    "1. Add New Villa \n" +
                    "2. Add New House \n" +
                    "3. Add New Room \n" +
                    "4. Back to Menu \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n){
                case "1":
                    addVillaService();
                    break;
                case "2":
                    addHouseService();
                    break;
                case "3":
                    addRoomService();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.out.println("Enter again");
            }
        }while (check);
        // 1. Add New Villa
        //2. Add New House
        //3. Add New Room
        //4. Back to menu



    }

    @Override
    public void displayListFacilityMaintenance() {

    }
    public void addVillaService(){
        // String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType,
        // String qualityRoom, int areaPool
        System.out.println(" Enter Service Code: ");
        String serviceCode = scanner.nextLine();

        System.out.println(" Enter Service Name: ");
        String serviceName = scanner.nextLine();

        System.out.println(" Enter Use Area: ");
        float useArea = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Rent Coast: ");
        int rentCoast = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Maximum People: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Rent Type: ");
        String rentType = scanner.nextLine();

        System.out.println(" Enter Quality Room: ");
        String qualityRoom = scanner.nextLine();

        System.out.println(" Enter Area Pool: ");
        int areaPool = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(serviceCode,serviceName,useArea,rentCoast,maximumPeople,rentType,qualityRoom,areaPool);
        facilityRepository.addNewFacility(villa);


    }
    public void addHouseService(){
        System.out.println(" Enter Service Code: ");
        String serviceCode = scanner.nextLine();

        System.out.println(" Enter Service Name: ");
        String serviceName = scanner.nextLine();

        System.out.println(" Enter Use Area: ");
        float useArea = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Rent Coast: ");
        int rentCoast = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Maximum People: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Rent Type: ");
        String rentType = scanner.nextLine();

        System.out.println(" Enter Quality Room: ");
        String qualityRoom = scanner.nextLine();

        System.out.println(" Enter Floor Number: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());

        // String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType,
        // String qualityRoom, int floorNumber

        House house = new House(serviceCode,serviceName,useArea,rentCoast,maximumPeople,rentType,qualityRoom,floorNumber);
        facilityRepository.addNewFacility(house);

    }
    public void addRoomService(){
        System.out.println(" Enter Service Code: ");
        String serviceCode = scanner.nextLine();

        System.out.println(" Enter Service Name: ");
        String serviceName = scanner.nextLine();

        System.out.println(" Enter Use Area: ");
        float useArea = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Rent Coast: ");
        int rentCoast = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Maximum People: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println(" Enter Rent Type: ");
        String rentType = scanner.nextLine();

        System.out.println(" Enter Free Service: ");
        String freeService = scanner.nextLine();

// String serviceCode, String serviceName, float useArea, int rentCoast, int maximumPeople, String rentType, String freeService
        Room room = new Room(serviceCode,serviceName,useArea,rentCoast,maximumPeople,rentType,freeService);
        facilityRepository.addNewFacility(room);
    }
}
