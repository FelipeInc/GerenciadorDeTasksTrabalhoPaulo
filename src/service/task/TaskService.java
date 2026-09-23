package service.task;

import DTO.task.TaskPostRequestDTO;
import domain.Task.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    List<Task> taskList = new ArrayList<>();

    public Task saveTask(TaskPostRequestDTO taskPostRequestDTO){
        Task task = new Task(taskPostRequestDTO.user(),
                taskPostRequestDTO.nameTask(), taskPostRequestDTO.taskStatus());
        taskList.add(task);
        return task;
    }

}
