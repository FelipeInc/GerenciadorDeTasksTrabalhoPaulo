import DTO.UserPostRequestDTO;
import domain.user.User;
import service.user.UserService;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserPostRequestDTO userPostRequestDTO = new UserPostRequestDTO("Felipe", "felipe@test.com", "123456");

        User user = userService.saveUser(userPostRequestDTO);

        System.out.println(user.toString());

        System.out.println("______________________________________");

        User userByID = userService.findUserByID(user.getIdUser());
        System.out.println(userByID.toString());

        System.out.println("________________________________________");

        userService.deleteUser(userByID.getIdUser());
        User userDeleted = userService.findUserByID(user.getIdUser());
        System.out.println(userDeleted.toString());
    }
}