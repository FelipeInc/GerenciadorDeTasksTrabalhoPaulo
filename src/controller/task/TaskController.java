package controller.task;

import DTO.task.TaskPostRequestDTO;
import domain.Task.TaskStatus;
import domain.user.User;
import repository.task.TaskRepositoryImpl;
import repository.user.UserRepositoryImpl;
import service.task.TaskService;
import service.user.UserService;

import java.util.Scanner;

public class TaskController {
    private final TaskRepositoryImpl taskRepository = new TaskRepositoryImpl();
    private final UserRepositoryImpl userRepository = new UserRepositoryImpl();

    private final TaskService taskService = new TaskService(taskRepository);
    private final UserService userService = new UserService(userRepository);

    Scanner scanner = new Scanner(System.in);

    public void saveTask(){
        System.out.println("Digite o nome da Task que deseja adicionar: ");
        String taskName = scanner.nextLine();

        System.out.println("Digite o seu id de usuario: ");
        int idUserToAddTask = scanner.nextInt();

        User userFoundToAddTask = userService.findUserByIDOrThrowNotFoundException(idUserToAddTask);

        System.out.println("Task adicionada com sucesso");

        taskService.saveTask(new TaskPostRequestDTO(userFoundToAddTask, taskName, TaskStatus.NOTSTARTED));
    }
}
