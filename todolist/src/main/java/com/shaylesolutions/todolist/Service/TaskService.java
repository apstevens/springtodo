package com.shaylesolutions.todolist.Service;

import java.util.List;

import com.shaylesolutions.todolist.Model.Task;

public interface TaskService {
    Task getTaskById(int id);

    void addTask(Task task);

    List<Task> getTasks();

}
