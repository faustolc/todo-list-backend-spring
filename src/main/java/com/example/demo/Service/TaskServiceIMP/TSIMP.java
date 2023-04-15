package com.example.demo.Service.TaskServiceIMP;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Task;
import com.example.demo.Repository.TaskRepo;
import com.example.demo.Service.TaskService;

@Service
public class TSIMP implements TaskService{

    @Autowired
    private TaskRepo repo;

    @Override
    public List<Task> getActiveTasks() {
        return (List<Task>) this.repo.findAll();
    }

    @Override
    public List<Task> getCompletedTasks() {
        return (List<Task>) this.repo.findAll();
    }

    @Override
    public Task createTask(Task task) {
        // task.setId(task.getId());
        return this.repo.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return this.repo.save(task);
    }

    @Override
    public Task findTask(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void deleteTask(int id) {
        this.repo.deleteById(id);
    }
    
}
