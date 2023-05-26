package com.example.spring_milestone_project.beans;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring_milestone_project.pojo.Task;

@Component
public class TaskListBean {
    
    private List<Task> taskList;

    public TaskListBean() {
        this.taskList = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return this.taskList;
    }

    public void addTask(Task task) {
        this.taskList.add(task); 
    }
}
