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
		return todoMapper.selectTodoList();
	}

	@Override
	public int insertTodo(TodoVO todoVO) {
		int result = todoMapper.insertTodo(todoVO);
		if(result > 0) {
			return result;
		}else {
			return -1;
		}
	}

	@Override
	public int updateTodo(TodoVO todoVO) {
		int result = todoMapper.updateTodo(todoVO);
		if(result > 0) {
			return todoVO.getTaskNo();
		}else {
			return -1;
		}
	}

	@Override
	public int deleteTodo(int todoNo) {
		int result = todoMapper.delelteTodo(todoNo);
		if(result > 1) {
			return todoNo;
		}else {
			return -0;	
		}
	}

}
