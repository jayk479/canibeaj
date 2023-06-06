package com.jayk.app.todo.mapper;

import java.util.List;

import com.jayk.app.todo.service.TodoVO;

public interface TodoMapper {
	
	public List<TodoVO> selectAllTodo();

}
