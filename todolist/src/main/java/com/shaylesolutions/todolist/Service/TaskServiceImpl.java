package com.shaylesolutions.todolist.Service;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import com.shaylesolutions.todolist.Model.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaylesolutions.todolist.Repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getTaskById(int id) {
        return taskRepository.getTask(findIndexById(id));
    }

    @Override
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.getTasks();
    }

    public Task updateTask(int id, Task task) {
        return taskRepository.updateTask(id, task);
    }

    private int findIndexById(int id) {
        List<Task> tasks = taskRepository.getTasks();
        OptionalInt indexOpt = IntStream.range(0, tasks.size())
                .filter(i -> tasks.get(i).getId() == id)
                .findFirst();
        return indexOpt.orElse(-1); // Return -1 if the ID is not found
    }

}
