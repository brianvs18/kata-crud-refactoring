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
    private InterfaceTodoServices repository;


    public List<TodoDTO> list(){
        return (List<TodoDTO>) repository.list();
    }

    public TodoDTO save(TodoDTO todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete((id));
    }

    public TodoDTO get(Long id){
         return repository.get(id);
    }

}
