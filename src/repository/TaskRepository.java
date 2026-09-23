package repository;

import domain.Task.Task;

public interface TaskRepository {
    Task saveTask(Task task);
}
