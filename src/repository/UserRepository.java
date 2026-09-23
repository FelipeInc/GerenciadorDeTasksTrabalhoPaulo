package repository;

import domain.user.User;

public interface UserRepository {
    User findUser(User user);
    User save(User user);
}
