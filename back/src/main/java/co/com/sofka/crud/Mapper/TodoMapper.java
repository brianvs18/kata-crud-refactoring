package co.com.sofka.crud.Mapper;

import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;

public class TodoMapper {

    public static Todo DtoToEntity(TodoDTO dto){
        return new Todo().setId(dto.getId()).setName(dto.getName()).setCompleted(dto.isCompleted());
    }

    public static TodoDTO EntityToDto(Todo todo){
        return new TodoDTO().setId(todo.getId()).setName(todo.getName()).setCompleted(todo.isCompleted());
    }
}
