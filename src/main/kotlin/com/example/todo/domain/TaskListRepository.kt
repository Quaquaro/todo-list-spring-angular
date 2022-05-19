package com.example.todo.domain

import org.springframework.data.repository.*

//first parameter type of entity second typ of primary key

interface TaskListRepository : CrudRepository<TaskList, Long>
