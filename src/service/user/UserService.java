package service.user;

import DTO.user.UserRegisterPostRequestDTO;
import DTO.user.UserUpdatePutRequestDTO;
import domain.exception.NotFoundException;
import domain.user.User;
import repository.user.UserRepositoryImpl;

public class UserService {
    private final UserRepositoryImpl userRepository;

    public UserService(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserRegisterPostRequestDTO userPostRequestDTO) {
        User user = new User(
                userPostRequestDTO.nameUser(),
                userPostRequestDTO.emailUser(),
                userPostRequestDTO.password()
        );
        userRepository.save(user);
    }

    public User findUserByIDOrThrowNotFoundException(int id) {
        User userById = userRepository.findUserById(id);

        if (userById == null) {
            throw new NotFoundException("User not found");
        }

        return userById;
    }

    public void updateUser(UserUpdatePutRequestDTO userUpdatePutRequestDTO) {
        User userToBeUpdated = findUserByIDOrThrowNotFoundException(userUpdatePutRequestDTO.idUser());

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

    public void deleteUser(int id) {
        User userToBeDeleted = findUserByIDOrThrowNotFoundException(id);
        userRepository.deleteUser(userToBeDeleted);
    }
}
