package co.com.sofka.crud.Mapper;

import co.com.sofka.crud.DTO.ListTodoDTO;
import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.ListTodo;
import co.com.sofka.crud.Entities.Todo;

public class ListTodoMapper {

    public static ListTodo DtoToListEntity(ListTodoDTO dto){
        return new ListTodo().setId(dto.getId()).setNameList(dto.getNameList()).setTodoList(dto.getTodoListDTO());
    }

    public static ListTodoDTO EntityToListDto(ListTodo listTodo){
        return new ListTodoDTO().setId(listTodo.getId())
                .setNameList(listTodo.getNameList()).setTodoListDTO(listTodo.getTodoList());
    }
}
