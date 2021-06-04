package co.com.sofka.crud.Services;

import co.com.sofka.crud.Abstracts.InterfaceTodoServices;
import co.com.sofka.crud.Abstracts.TodoRepository;
import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements InterfaceTodoServices {

    @Autowired
    private TodoRepository services;

    public Iterable<Todo> list(){
        return services.findAll();
    }

    public Todo save(TodoDTO todo){
        return services.save(todo);
    }

    public void delete(Long id){
        services.delete(get(id));
    }

    public Todo get(Long id){
         return services.findById(id).orElseThrow();
    }

}
