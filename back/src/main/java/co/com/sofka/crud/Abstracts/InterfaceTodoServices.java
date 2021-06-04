package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;

import java.util.List;

public interface InterfaceTodoServices {

    Iterable<TodoDTO> list();
    TodoDTO save(TodoDTO todo);
    void delete(Long id);
    TodoDTO get(Long id);
}
