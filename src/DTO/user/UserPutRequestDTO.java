package DTO.user;

import domain.Task.Task;
import domain.user.User;

import java.util.List;

public record UserPutRequestDTO(User user, List<Task> taskList) {
}
