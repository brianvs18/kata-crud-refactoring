package co.com.sofka.crud.DTO;

import java.util.List;
public class ListTodoDTO {

    private Integer id;
    private String nameList;
    private List<TodoDTO> todoListDTO;

    public Integer Id() {
        return id;
    }

    public void saveId(Integer id) {
        this.id = id;
    }

    public String NameList() {
        return nameList;
    }

    public void saveNameList(String nameList) {
        this.nameList = nameList;
    }

    public List<TodoDTO> todoListDTO() {
        return todoListDTO;
    }

    public void saveTodoListDTO(List<TodoDTO> todoListDTO) {
        this.todoListDTO = todoListDTO;
    }
}
