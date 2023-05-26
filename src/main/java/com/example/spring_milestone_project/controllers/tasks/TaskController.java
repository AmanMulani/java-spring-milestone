package com.example.spring_milestone_project.controllers.tasks;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_milestone_project.beans.TaskListBean;
import com.example.spring_milestone_project.pojo.Task;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskListBean taskListBean;

    @PostMapping
    private ResponseEntity<?> addTask(@RequestBody Task task) {
        this.taskListBean.addTask(task);
        return new ResponseEntity<String>("OK", HttpStatus.ACCEPTED);
    }

    @GetMapping
    private ResponseEntity<List<Task>> getTasks() {
        return new ResponseEntity<List<Task>>(this.taskListBean.getTasks(), HttpStatus.OK);
    }
}
