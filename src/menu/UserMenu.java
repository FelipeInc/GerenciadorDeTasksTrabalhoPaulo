package menu;

import controller.UserControler;

import java.util.Scanner;

public class UserMenu {
    public static void displayMenuUser() {
        boolean isMenuUserON = true;

        UserControler userControler = new UserControler();
        Scanner scanner = new Scanner(System.in);

        do {
            MenuMessage.displayMenuUserMessage();
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> userControler.register();
                case 2 -> userControler.findUser();
                case 3 -> userControler.updateUser();
                case 4 -> userControler.deleteUser();
                case 5 -> isMenuUserON = false;
                default -> System.out.println("Opcao invalida");
            }
        } while (isMenuUserON);
    }

}
