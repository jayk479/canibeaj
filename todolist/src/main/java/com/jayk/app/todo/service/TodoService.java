package com.jayk.app.todo.service;

import java.util.List;


public interface TodoService {
	
	//전체조회
	public List<TodoVO> getAllTodo();
	
	//등록
	public int insertTodo(TodoVO todoVO);
	
	//수정
	public int updateTodo(TodoVO todoVO);
	
	//삭제
	public int deleteTodo(int todoNo);

}
