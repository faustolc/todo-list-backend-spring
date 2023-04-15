# TODO List REST API 

Simple back-end project for [TODO List Angular](https://github.com/faustolc/todo-list-angular)

## Developmen server

Run `mvn spring-boot:run`.

## Endpoin mappings

 This project runs in `http://localhost:8080/todo/api`.

 `http://localhost:8080/todo/api/active`    GET  => Get all active tasks. Active task is task whit status = 1.
 `http://localhost:8080/todo/api/completed` GET  => Get all completed tasks. Active task is task whit status = 2.
 `http://localhost:8080/todo/api/task/(id)` GET  => Get a tasks by id.
 `http://localhost:8080/todo/api/add`       POST => Add a new task.
 `http://localhost:8080/todo/api/update`    PUT  => Update a task.
  
  