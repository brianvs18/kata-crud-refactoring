package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.Entities.ListTodo;

import java.util.List;

public interface InterfaceListTodoServices {

    List<ListTodo> getAllListTodo();
    ListTodo saveList(ListTodo listTodo);
    void deleteListTodo(int id);
    ListTodo getListTodo(int id);

    }
