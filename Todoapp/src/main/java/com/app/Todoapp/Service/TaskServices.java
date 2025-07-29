package com.app.Todoapp.Service;


import com.app.Todoapp.models.Task;
import com.app.Todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServices {

    @Autowired
    public TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }


    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);

    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toogleTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }

}
