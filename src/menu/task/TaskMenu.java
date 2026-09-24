package menu.task;

import controller.task.TaskController;
import controller.user.UserControler;
import menu.message.MenuMessage;

import java.util.Scanner;

public class TaskMenu {
    public static void displayMenuTask() {
        boolean isMenutaskON = true;

        TaskController taskController = new TaskController();
        Scanner scanner = new Scanner(System.in);

        do {
            MenuMessage.displayMenuTaskMessage();
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> taskController.saveTask();
//                case 2 -> userControler.findUser();
//                case 3 -> userControler.updateUser();
//                case 4 -> userControler.deleteUser();
                case 5 -> isMenutaskON = false;
                default -> System.out.println("Opcao invalida");
            }
        } while (isMenutaskON);
    }
}
