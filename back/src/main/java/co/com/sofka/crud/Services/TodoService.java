package co.com.sofka.crud.Services;

import co.com.sofka.crud.Abstracts.InterfaceTodoServices;
import co.com.sofka.crud.Abstracts.TodoRepository;
import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements InterfaceTodoServices {

    @Autowired
    private InterfaceTodoServices services;


    public List<TodoDTO> list(){
        return (List<TodoDTO>) services.list();
    }

    public TodoDTO save(TodoDTO todo){
        return services.save(todo);
    }

    public void delete(Long id){
        services.delete(id);
    }

    public TodoDTO get(Long id){
         return services.get(id);
    }

}
