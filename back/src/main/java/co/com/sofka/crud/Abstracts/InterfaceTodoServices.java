package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;

import java.util.List;

public interface InterfaceTodoServices {

    List<Todo> list();
    Todo save(Todo todo);
    void delete(Long id);
    Todo get(Long id);
}
