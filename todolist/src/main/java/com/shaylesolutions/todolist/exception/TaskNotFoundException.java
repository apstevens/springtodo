package com.shaylesolutions.todolist.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(int id) {
        super("The id '" + id + "' does not exist in our records");
    }
}
