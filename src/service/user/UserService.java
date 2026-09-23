package service.user;

import DTO.UserPostRequestDTO;
import DTO.UserPutRequestDTO;
import domain.Task.Task;
import domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> usersDb = new ArrayList<>();

    public User saveUser(UserPostRequestDTO userPostRequestDTO){
        User user = new User(
                userPostRequestDTO.nameUser(),
                userPostRequestDTO.emailUser(),
                userPostRequestDTO.password()
        );
        usersDb.add(user);
        return user;
    }

    public User findUserByID(int id){
        return usersDb.stream()
                    .filter(user -> user.getIdUser() == id)
                    .findFirst()
                    .orElse(null);
    }

    public void deleteUser(int id){
        User userToBeDeleted = findUserByID(id);
        usersDb.remove(userToBeDeleted);
    }
}
