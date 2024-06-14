package com.shaylesolutions.todolist.Model;

import jakarta.validation.constraints.NotBlank;

public class Task {
    private int tId;

    @NotBlank(message = "Task cannot be blank")
    private String tTask;
    private String tDescription;

    public Task(int id, String task, String description) {
        tId = id;
        tTask = task;
        tDescription = description;
    }

    public int getId() {
        return this.tId;
    }

    public void setId(int id) {
        this.tId = id;
    }

    public String getTask() {
        return this.tTask;
    }

    public void setTask(String task) {
        this.tTask = task;
    }

    public String getDescription() {
        return this.tDescription;
    }

    public void setDescription(String description) {
        this.tDescription = description;
    }

}
