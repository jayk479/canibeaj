package com.jayk.app.todo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jayk.app.todo.mapper.TodoMapper;
import com.jayk.app.todo.service.TodoService;
import com.jayk.app.todo.service.TodoVO;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@Autowired
	TodoMapper todoMapper;

	@GetMapping("todoList")
	public String getAllTodoList(Model model, TodoVO todoVo) {
		model.addAttribute("todoVo", todoVo);
		model.addAttribute("todoList", todoService.getAllTodo());
		return "todo/list";
	}
	
	@PostMapping("insertTodo")
	public String insertTodoList(TodoVO todoVo) {
		todoService.insertTodo(todoVo);
		return "rediret : todoList";
	}
	
	@PostMapping("updateTodo")
	public String updateTodoList(Model model, TodoVO todoVo) {
		TodoVO vo = todoMapper.selectTodo(todoVo);
		model.addAttribute("todoVo", vo);
		todoService.updateTodo(todoVo);
		return "redirect : todoList";
	}
	
	@GetMapping("deleteTodo")
	public String deleteTodoList(int todoNo) {
		todoService.deleteTodo(todoNo);
		return "redirect : todoList";
	}
	
	
}
