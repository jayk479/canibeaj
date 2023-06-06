package com.jayk.app.todo.service;

import java.util.Date;

import lombok.Data;

@Data
public class TodoVO {
	
	private String task;
	private Date taskDate;
	private int done;

}
