package controller;

import DTO.user.UserRegisterPostRequestDTO;
import domain.user.User;
import repository.UserRepositoryImpl;
import service.user.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserControler {
    private final UserRepositoryImpl userRepository = new UserRepositoryImpl();
    private final UserService userService = new UserService(userRepository);

    List<User> usersDb = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void register(){
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();

        userService.saveUser(usersDb, new UserRegisterPostRequestDTO(name, email, password));

        System.out.println("Usuario registrado com sucesso");
    }

    public void findUser(){
        System.out.println("Digite o id do usuario: ");
        int id = scanner.nextInt();

        User userFinded = userService.findUserByIDOrThrowNotFoundException(usersDb, id);

        System.out.println(userFinded.toString());
    }
}
