package com.midterm.anaBalukha.service;

import com.midterm.anaBalukha.dto.TaskRequestDTO;
import com.midterm.anaBalukha.dto.TaskResponseDTO;
import com.midterm.anaBalukha.entity.Task;
import com.midterm.anaBalukha.entity.User;
import com.midterm.anaBalukha.repository.TaskRepository;
import com.midterm.anaBalukha.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public TaskService(TaskRepository taskRepository, UserRepository userRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public TaskResponseDTO create(TaskRequestDTO dto) {

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setUser(user);

        Task saved = taskRepository.save(task);

        return new TaskResponseDTO(
                saved.getId(),
                saved.getTitle(),
                saved.getDescription(),
                user.getId()
        );
    }

    public List<TaskResponseDTO> getAll() {
        return taskRepository.findAll()
                .stream()
                .map(t -> new TaskResponseDTO(
                        t.getId(),
                        t.getTitle(),
                        t.getDescription(),
                        t.getUser().getId()
                ))
                .collect(Collectors.toList());
    }

    public TaskResponseDTO getById(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        return new TaskResponseDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getUser().getId()
        );
    }

    public TaskResponseDTO update(Long id, TaskRequestDTO dto) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setUser(user);

        Task updated = taskRepository.save(task);

        return new TaskResponseDTO(
                updated.getId(),
                updated.getTitle(),
                updated.getDescription(),
                user.getId()
        );
    }

    public void delete(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task not found");
        }
        taskRepository.deleteById(id);
    }

}
