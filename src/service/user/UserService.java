package service.user;

import DTO.user.UserRegisterPostRequestDTO;
import DTO.user.UserUpdatePutRequestDTO;
import domain.exception.NotFoundException;
import domain.user.User;
import repository.UserRepositoryImpl;

import java.util.List;

public class UserService {
    private final UserRepositoryImpl userRepository;

    public UserService(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(List<User> usersDb, UserRegisterPostRequestDTO userPostRequestDTO) {
        User user = new User(
                userPostRequestDTO.nameUser(),
                userPostRequestDTO.emailUser(),
                userPostRequestDTO.password()
        );
        userRepository.save(usersDb, user);
    }

    public User findUserByIDOrThrowNotFoundException(List<User> usersDb, int id) {
        User userById = userRepository.findUserById(usersDb, id);

        if (userById == null) {
            throw new NotFoundException("User not found");
        }

        return userById;
    }

    public void updateUser(List<User> usersDb, UserUpdatePutRequestDTO userUpdatePutRequestDTO) {
        User userToBeUpdated = findUserByIDOrThrowNotFoundException(usersDb, userUpdatePutRequestDTO.idUser());

        userToBeUpdated.setIdUser(userToBeUpdated.getIdUser());

        if (userUpdatePutRequestDTO.emailUser() != null && !userUpdatePutRequestDTO.emailUser().isBlank()) {
            userToBeUpdated.setEmailUser(userUpdatePutRequestDTO.emailUser());
        }

        if (userUpdatePutRequestDTO.nameUser() != null && !userUpdatePutRequestDTO.nameUser().isBlank()) {
            userToBeUpdated.setNameUser(userUpdatePutRequestDTO.nameUser());
        }

        if (userUpdatePutRequestDTO.password() != null && !userUpdatePutRequestDTO.password().isBlank()) {
            userToBeUpdated.setPassword(userUpdatePutRequestDTO.password());
        }
    }

    public void deleteUser(List<User> usersDb, int id) {
        User userToBeDeleted = findUserByIDOrThrowNotFoundException(usersDb, id);
        usersDb.remove(userToBeDeleted);
    }
}
