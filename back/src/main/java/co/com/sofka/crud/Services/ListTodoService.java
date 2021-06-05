package co.com.sofka.crud.Services;

import co.com.sofka.crud.Abstracts.InterfaceListTodoServices;
import co.com.sofka.crud.Abstracts.ListTodoRepository;
import co.com.sofka.crud.Entities.ListTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListTodoService implements InterfaceListTodoServices {

    @Autowired
    private ListTodoRepository repository;

    @Override
    public List<ListTodo> getAllListTodo(){
        return repository.findAll();
    }

    @Override
    public ListTodo saveList(ListTodo listTodo){
        return repository.save(listTodo);
    }

    @Override
    public void deleteListTodo(int id){
        repository.delete(getListTodo(id));
    }

    @Override
    public ListTodo getListTodo(int id){
        return repository.findById(id).orElseThrow();
    }
}
