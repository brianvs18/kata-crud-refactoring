package co.com.sofka.crud.Services;

import co.com.sofka.crud.Abstracts.InterfaceTodoServices;
import co.com.sofka.crud.Abstracts.TodoRepository;
import co.com.sofka.crud.Entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Path("todo")
public class TodoService implements InterfaceTodoServices {

    @Autowired
    private InterfaceTodoServices repository;

    /*
    public List<Todo> list(){
        return (List<Todo>) repository.findAll();
    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public Todo get(Long id){
         return repository.findById(id).orElseThrow();
    }
    */



}
