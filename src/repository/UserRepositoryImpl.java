package repository;

import domain.user.User;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public User findUserById(List<User> usersDb, int id) {
        User userById = usersDb.stream()
                .filter(user -> user.getIdUser() == id)
                .findFirst()
                .orElse(null);
        return userById;
    }

    @Override
    public User save(List<User> usersDb, User user) {
        usersDb.add(user);
        return user;
    }
}
