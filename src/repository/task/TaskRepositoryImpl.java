package repository.task;

import Db.Database;
import domain.Task.Task;

public class TaskRepositoryImpl implements TaskRepository{
    Database dataBase = new Database();


    @Override
    public void saveTask(Task task) {
        dataBase.getTaskDb().add(task);
    }

}
