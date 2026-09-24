package Db;

import domain.Task.Task;
import domain.user.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<User> userDb = new ArrayList<>();
    private final List<Task> taskDb = new ArrayList<>();

    public List<User> getUserDb(){
        return userDb;
    }

    public List<Task> getTaskDb(){
        return taskDb;
    }
}
