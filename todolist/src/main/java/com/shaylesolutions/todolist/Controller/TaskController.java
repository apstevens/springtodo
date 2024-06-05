package com.shaylesolutions.todolist.Controller;

import com.shaylesolutions.todolist.Model.Task;
import com.shaylesolutions.todolist.Service.TaskService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Task Controller", description = "Add, retrieve and update tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Operation(summary = "Retrieves tasks", description = "Provides a list of all tasks")
    @ApiResponse(responseCode = "200", description = "Successful retrieval of tasks",
        content = @Content(array = @ArraySchema(schema = @Schema(implementation = Task.class))))
    @GetMapping(value = "/task/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = taskService.getTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful retrieval of tasks", 
        content = @Content(array = @ArraySchema(schema = @Schema(implementation = Task.class)))),
        @ApiResponse(responseCode = "404", description = "Task cannot be found/doesn't exist",
        content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
    })
    @Operation(summary = "Retrieves task based on ID", description = "Returns a task based on ID")
    @GetMapping(value = "/task/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> getTask(@PathVariable int id) {
        Task task = taskService.getTaskById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Bad request: unsuccessful update", content = 
            @Content(schema = 
            @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "201", description = "Successful creation of task"),
    })
    @Operation(summary = "Create Task", description = "Creates a task from the provided payload")
    @PostMapping(value = "/task", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> addTask(@Valid @RequestBody Task task) {
        taskService.addTask(task);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }
}
