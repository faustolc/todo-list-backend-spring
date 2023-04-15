package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.Service.TaskServiceIMP.TSIMP;
import com.example.demo.Entity.Task;

@RestController
@RequestMapping("todo/api")
public class TaskController {

    @Autowired
    private TSIMP impl;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    @RequestMapping(method = RequestMethod.GET, value = "active")
    public ResponseEntity<?> getActiveTasks() {
        List<Task> listTasks = this.impl.getActiveTasks();
        listTasks = listTasks.stream().filter(task -> task.getStatus() == 1).collect(Collectors.toList());
        return ResponseEntity.ok(listTasks);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    @RequestMapping(method = RequestMethod.GET, value = "completed")
    public ResponseEntity<?> getCompletedTasks() {
        List<Task> listTasks = this.impl.getActiveTasks();
        listTasks = listTasks.stream().filter(task -> task.getStatus() == 2).collect(Collectors.toList());
        return ResponseEntity.ok(listTasks);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    @RequestMapping(method = RequestMethod.POST, value = "add")
    public ResponseEntity<?> addTask(@RequestBody Task task) {
        Task newTask = this.impl.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTask);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    @RequestMapping(method = RequestMethod.GET, value = "task/{id}")
    public ResponseEntity<?> getTask(@PathVariable int id) {
        Task task = this.impl.findTask(id);
        return ResponseEntity.ok(task);
    }

    
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    @RequestMapping(method = RequestMethod.PUT, value = "update")
    public ResponseEntity<?> updateTask(@RequestBody Task task) {
        Task updatedTask = this.impl.updateTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(updatedTask);
    }

}
