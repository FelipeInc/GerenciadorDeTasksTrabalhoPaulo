package repository.user;

import domain.user.User;

import java.util.List;

public interface UserRepository {
    void save(User user);

    User findUserById(int id);

    void deleteUser(User user);
}
