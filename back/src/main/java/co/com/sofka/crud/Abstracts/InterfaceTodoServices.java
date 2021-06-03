package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;

import java.util.List;

public interface InterfaceTodoServices {

    public List<TodoDTO> list();
    public TodoDTO save(TodoDTO todo);
    public void delete(Long id);
    public TodoDTO get(Long id);
}
