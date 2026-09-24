package menu;

import menu.User.UserMenu;
import menu.message.MenuMessage;
import menu.task.TaskMenu;

import java.util.Scanner;

public class MainMenu {
    public static boolean displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        MenuMessage.displayMainMenuMessage();

        int number = scanner.nextInt();

        switch (number) {
            case 1 -> UserMenu.displayMenuUser();
            case 2 -> TaskMenu.displayMenuTask();
            case 3 -> {
                return false;
            }
            default -> System.out.println("Opcao invalida");
        }
        return true;
    }
}