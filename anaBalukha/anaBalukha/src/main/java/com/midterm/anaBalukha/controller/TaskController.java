package com.midterm.anaBalukha.controller;

import com.midterm.anaBalukha.dto.TaskRequestDTO;
import com.midterm.anaBalukha.dto.TaskResponseDTO;
import com.midterm.anaBalukha.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public TaskResponseDTO create(@RequestBody TaskRequestDTO dto) {
        return taskService.create(dto);
    }

    @GetMapping
    public List<TaskResponseDTO> getAll() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public TaskResponseDTO getById(@PathVariable Long id) {
        return taskService.getById(id);
    }

    @PutMapping("/{id}")
    public TaskResponseDTO update(@PathVariable Long id, @RequestBody TaskRequestDTO dto) {
        return taskService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }

}
