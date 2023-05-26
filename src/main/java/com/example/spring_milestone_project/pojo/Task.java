package com.example.spring_milestone_project.pojo;

import lombok.Data;
import com.example.spring_milestone_project.enums.TaskState;


@Data
public class Task {
    
    private final String id;
    private final String name;
    private final String description;
    private final TaskState taskState;

}
