package co.com.sofka.crud.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListTodoDTO {

    private Integer id;
    private String nameList;
    private List<TodoDTO> todoListDTO;

}
