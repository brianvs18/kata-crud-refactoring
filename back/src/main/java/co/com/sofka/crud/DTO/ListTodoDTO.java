package co.com.sofka.crud.DTO;

import co.com.sofka.crud.Entities.Todo;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class ListTodoDTO {

    private Integer id;
    private String nameList;
    private List<Todo> todoListDTO;

}
