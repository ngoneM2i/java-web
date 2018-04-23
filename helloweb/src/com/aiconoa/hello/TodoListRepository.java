package com.aiconoa.hello;

import java.util.ArrayList;

public class TodoListRepository {

	/**
	 * Retourne une todolist en fonction de son id
	 * @param todoListId
	 * @return la todolist ou null si aucune todolist ne correspond à l'identifiant
	 */
	public ArrayList<Todo> findTodoListById(int todoListId) {
		if(todoListId == 1) {
			ArrayList<Todo> todoList = new ArrayList<>();
			todoList.add(new Todo("Apprendre Java"));
			todoList.add(new Todo("Apprendre Java EE"));
			return todoList;
		} else if (todoListId == 2) {
			ArrayList<Todo> todoList = new ArrayList<>();
			todoList.add(new Todo("Apprendre HTML"));
			todoList.add(new Todo("Apprendre CSS"));
			todoList.add(new Todo("Apprendre JavaScript"));
			return todoList;
		} else {
			return null;
		}
	}
	
}
