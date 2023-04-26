package view;

import controllers.FuramaController;

public class MainMenu {
    static FuramaController furamaController = new FuramaController();


    public static void main(String[] args) {
        furamaController.displayMainMenu();
    }
}
