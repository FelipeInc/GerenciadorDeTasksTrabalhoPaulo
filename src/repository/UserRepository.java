package repository;

import domain.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(List<User> usersDb, User user);

    User findUserById(List<User> usersDb, int id);
}
