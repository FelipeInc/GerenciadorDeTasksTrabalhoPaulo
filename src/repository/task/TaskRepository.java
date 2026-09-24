package repository.task;

import domain.Task.Task;

import java.util.List;

public interface TaskRepository {
    void saveTask(Task task);
}
