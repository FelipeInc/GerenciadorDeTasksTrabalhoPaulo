package DTO.task;

import domain.Task.TaskStatus;
import domain.user.User;

public record TaskPostRequestDTO (User user, String nameTask, TaskStatus taskStatus){
}
