package com.example.demo.Repository;

import com.example.demo.Entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Task,Integer>{

    
}
