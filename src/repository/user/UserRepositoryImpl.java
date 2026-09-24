package repository.user;

import Db.Database;
import domain.user.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    Database database = new Database();

    @Override
    public User findUserById(int id) {
        return database.getUserDb().stream()
                .filter(user -> user.getIdUser() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(User user) {
        database.getUserDb().add(user);
    }

    @Override
    public void deleteUser(User user) {
        database.getUserDb().remove(user);
    }
}
