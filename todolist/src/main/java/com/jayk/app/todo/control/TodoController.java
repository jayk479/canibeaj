package com.jayk.app.todo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jayk.app.todo.service.TodoService;
import com.jayk.app.todo.service.TodoVO;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;

	@GetMapping("todoList")
	public String getAllTodoList(Model model, TodoVO todoVo) {
		model.addAttribute("todoVo", todoVo);
		model.addAttribute("todoList", todoService.getAllTodo());
		return "todo/list";
	}
}
