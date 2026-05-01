package com.midterm.anaBalukha.repository;

import com.midterm.anaBalukha.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
