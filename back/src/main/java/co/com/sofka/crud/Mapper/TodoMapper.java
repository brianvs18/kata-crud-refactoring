package co.com.sofka.crud.Mapper;

import co.com.sofka.crud.DTO.IDtoEntity;
import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {
    /*
    public static Todo DtoToEntity(TodoDTO dto){
        return new Todo().setId(dto.getId()).setName(dto.getName());
    }

    public static TodoDTO EntityToDto(Todo todo){
        return new TodoDTO().setName(todo.getName());
    }
     */
    @Autowired
    private ModelMapper model;

    public IDtoEntity convertToDto(Object obj, IDtoEntity dto){
        return model.map(obj, dto.getClass());
    }

    public Object converToEntity (IDtoEntity dto, Object obj){
        return model.map(dto, obj.getClass());
    }

}
