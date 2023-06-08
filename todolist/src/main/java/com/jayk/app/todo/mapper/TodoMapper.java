package com.jayk.app.todo.mapper;

import java.util.List;

import com.jayk.app.todo.service.TodoVO;

public interface TodoMapper {
	
	//전체조회
	public List<TodoVO> selectTodoList();
	
	//단건조회
	public TodoVO selectTodo(TodoVO todoVO);
	
	//등록
	public int insertTodo(TodoVO todoVO);
	
	//수정
	public int updateTodo(TodoVO todoVO);
	
	//삭제
	public int delelteTodo(int todoNo);
	

}
