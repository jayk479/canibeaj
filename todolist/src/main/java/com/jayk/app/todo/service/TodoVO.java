package com.jayk.app.todo.service;


import lombok.Data;

@Data
public class TodoVO {
	private int taskNo;
	private String task;
	private String taskDate;
	private int done;

}
