package domain.user;

import domain.Task.Task;
import repository.UserRepository;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class User implements UserRepository {
    private final int idUser = ThreadLocalRandom.current().nextInt(1,10000);
    private String nameUser;
    private String emailUser;
    private String password;
    private List<Task> task;

    public User(String nameUser, String emailUser, String password) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.password = password;
    }

    public User(String nameUser, String emailUser, String password, List<Task> task) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.password = password;
        this.task = task;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return java.util.Objects.equals(idUser, user.idUser);
}

    @Override
    public User findUser(User user) {
        return user;
    }

    @Override
    public User save(User user) {
        return user;
    }
}
