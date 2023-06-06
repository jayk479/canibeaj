package com.jayk.app.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayk.app.todo.mapper.TodoMapper;
import com.jayk.app.todo.service.TodoService;
import com.jayk.app.todo.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	TodoMapper todoMapper;

	@Override
	public List<TodoVO> getAllTodo() {
		return todoMapper.selectAllTodo();
	}

}
