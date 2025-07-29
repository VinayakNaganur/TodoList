package com.app.Todoapp.Controller;


import com.app.Todoapp.Service.TaskServices;
import com.app.Todoapp.models.Task;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {


    @Autowired
    private TaskServices taskServices;

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title) {
        taskServices.createTask(title);
        return "redirect:/tasks";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask (@PathVariable Long id) {
        taskServices.deleteTask(id);
        return"redirect:/tasks";
    }

    @GetMapping("/{id}/toggle")
        public String toggleTask(@PathVariable Long id) {
            taskServices.toogleTask(id);
            return "redirect:/tasks";
        }


}