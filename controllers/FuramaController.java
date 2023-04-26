package controllers;

import java.util.Scanner;

public class FuramaController {

    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean check = true;
        do {
            System.out.println("1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "6":
                    check = false;
                default:
                    System.out.println("Enter your choice again");

            }
        } while (check);
    }

    private void employeeManagement() {
//
        boolean check = true;
        do {
            System.out.println("1. Display List Employee \n" +
                    "2. Add New Employee \n" +
                    "3. Edit Employee \n" +
                    "4. Return Menu \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    check = false;
                default:
                    System.out.println("Enter your choice Again");
            }
        } while (check);
    }

    private void customerManagement() {
        boolean check = true;
        do {
            System.out.println("1. Display List Customer \n" +
                    "2. Add New Customer \n" +
                    "3. Edit Customer \n" +
                    "4. Return Menu \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    check = false;
                default:
                    System.out.println("Enter your choice Again");
            }
        } while (check);
    }

    private void facilityManagement() {
        //1 Display list facility
        //2 Add new facility
        //3 Display list facility maintenance
        //4 Return main menu
        //- Khi chọn chức năng số 4  Booking Managerment  thì chương trình hiển thị thanh
        //menu con bao gồm:

        boolean check = true;
        do {
            System.out.println("1. Display List Facility \n" +
                    "2. Add New Facility \n" +
                    "3. Display List Facility Maintenance \n" +
                    "4. Return Menu \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    check = false;
                default:
                    System.out.println("Enter your choice Again");
            }
        } while (check);
    }

    private void bookingManagement() {
        boolean check = true;
        do {
            System.out.println("1. Display List Booking \n" +
                    "2. Add New Booking \n" +
                    "3. Create New Contract \n" +
                    "4. Display List Contract \n" +
                    "5. Edit contract \n" +
                    "6. Return Menu \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    check = false;
                    break;
                default:
                    System.out.println("Enter your choice Again");
            }
        } while (check);

    }

    private void promotionManagement() {
        // 1. Display list customers use service
        //2. Display list customers get voucher
        //3. Return main menu
        boolean check = true;
        do {
            System.out.println("1. Display List Customer use Service \n" +
                    "2. Display List Customer get Voucher \n" +
                    "3. Return Menu \n" +
                    "Enter your choice");
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    check = false;
                    break;
                default:
                    System.out.println("Enter your choice Again");
            }
        } while (check);
    }
}
