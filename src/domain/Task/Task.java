package domain.Task;

import domain.user.User;
import repository.task.TaskRepository;


public class Task{
    private User user;
    private String nameTask;
    private TaskStatus taskStatus;

    public Task(User user, String nameTask, TaskStatus taskStatus) {
        this.user = user;
        this.nameTask = nameTask;
        this.taskStatus = taskStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

}
