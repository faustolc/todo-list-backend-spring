package com.example.demo.Service;

import com.example.demo.Entity.Task;

import java.util.List;

public interface TaskService{

    public List<Task> getActiveTasks();
    
    public List<Task> getCompletedTasks();
    
    public Task createTask(Task task);
    
    public Task updateTask(Task task);
    
    public Task findTask(int id);
    
    public void deleteTask(int id);
    
}
