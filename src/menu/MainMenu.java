package menu;

import java.util.Scanner;

public class MainMenu {
    public static boolean displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        MenuMessage.displayMainMenuMessage();

        int number = scanner.nextInt();

        switch (number) {
            case 1 -> UserMenu.displayMenuUser();
//            case 2 ->
            case 5 -> {
                return false;
            }
            default -> System.out.println("Opcao invalida");
        }
        return true;
    }
}