package com.shaylesolutions.todolist.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shaylesolutions.todolist.Model.Task;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task updateTask(int id, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTask(updatedTask.getTask());
                task.setDescription(updatedTask.getDescription());
                return task;
            }
        }
        return null;
    }

}
