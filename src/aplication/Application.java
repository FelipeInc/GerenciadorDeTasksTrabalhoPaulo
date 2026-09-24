package aplication;

import menu.MainMenu;

public class Application {
    public static void start(){
        boolean isSytemOn;

        do {
            isSytemOn = MainMenu.displayMainMenu();
        } while (isSytemOn);
    }
}
