package com.jayk.app.todo.service;

import java.util.Date;

import lombok.Data;

@Data
public class TodoVO {
	private int taskNo;
	private String task;
	private Date taskDate;
	private int done;

}
