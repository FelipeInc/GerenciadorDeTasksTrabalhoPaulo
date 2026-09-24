package controller.user;

import DTO.user.UserRegisterPostRequestDTO;
import DTO.user.UserUpdatePutRequestDTO;
import domain.user.User;
import repository.user.UserRepositoryImpl;
import service.user.UserService;

import java.util.Scanner;

public class UserControler {
    private final UserRepositoryImpl userRepository = new UserRepositoryImpl();
    private final UserService userService = new UserService(userRepository);

    Scanner scanner = new Scanner(System.in);

    public void register() {
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();

        userService.saveUser(new UserRegisterPostRequestDTO(name, email, password));

        System.out.println("Usuario registrado com sucesso");
    }

    public void findUser() {
        System.out.println("Digite o id do usuario: ");
        int idToFind = scanner.nextInt();

        User userFinded = userService.findUserByIDOrThrowNotFoundException(idToFind);

        System.out.println(userFinded.toString());
    }

    public void updateUser() {
        System.out.println("Digite o id do usuario que deseja alterar: ");
        int idUserToBeUpdated = scanner.nextInt();

        System.out.println("Digite o novo nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();

        userService.updateUser(new UserUpdatePutRequestDTO(idUserToBeUpdated, name, email, password));
    }

    public void deleteUser() {
        System.out.println("Digite o id do usuario que deseja deletar: ");
        int isUserToBeDeleted = scanner.nextInt();

        userService.deleteUser(isUserToBeDeleted);

        System.out.println("Usuario deletado com sucesso");
    }
}
