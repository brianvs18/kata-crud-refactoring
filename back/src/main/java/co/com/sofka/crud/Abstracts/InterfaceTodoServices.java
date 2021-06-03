package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.Entities.Todo;

import java.util.List;

public interface InterfaceTodoServices {

    public List<Todo> list();
    public Todo save(Todo todo);
    public void delete(Long id);
    public Todo get(Long id);
}
