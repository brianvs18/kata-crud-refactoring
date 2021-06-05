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
    private TodoRepository repository;

    @Override
    public List<Todo> list(){
        return repository.findAll();
    }

    @Override
    public Todo save(Todo todo){
        return repository.save(todo);
    }

    @Override
    public void delete(Long id){
        repository.delete(get(id));
    }

    @Override
    public Todo get(Long id){
         return repository.findById(id).orElseThrow();
    }

}
