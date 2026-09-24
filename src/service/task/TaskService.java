package service.task;

import DTO.task.TaskPostRequestDTO;
import domain.Task.Task;
import repository.task.TaskRepository;
import repository.task.TaskRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final TaskRepositoryImpl taskRepositoryImpl;

    public TaskService(TaskRepositoryImpl taskRepository){
        this.taskRepositoryImpl = taskRepository;
    }

    public void saveTask(TaskPostRequestDTO taskPostRequestDTO){
        Task task = new Task(taskPostRequestDTO.user(),
                taskPostRequestDTO.nameTask(), taskPostRequestDTO.taskStatus());
        taskRepositoryImpl.saveTask(task);
    }

}
