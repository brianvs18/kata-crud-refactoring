package co.com.sofka.crud.Controller;

import co.com.sofka.crud.Abstracts.ListTodoRepository;
import co.com.sofka.crud.Entities.ListTodo;
import co.com.sofka.crud.Entities.Todo;
import co.com.sofka.crud.Services.ListTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ListTodoController {

    @Autowired
    private ListTodoService listTodoService;

    @GetMapping("/listTodos")
    public List<ListTodo> getAllListTodo(){
        return listTodoService.getAllListTodo();
    }

    @PostMapping(value = "/listTodo")
    public ListTodo saveList(@RequestBody ListTodo listTodo){
        return listTodoService.saveList(listTodo);
    }

    @PutMapping(value = "/listTodo")
    public ListTodo updateList(@RequestBody ListTodo listTodo){
        if(listTodo.getId() != null){
            return listTodoService.saveList(listTodo);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "/{id}/listTodo")
    public void delete(@PathVariable("id")Integer id){
        listTodoService.deleteListTodo(id);
    }

    @GetMapping(value = "/{id}/listTodo")
    public ListTodo getListTodo(@PathVariable("id") Integer id){
        return listTodoService.getListTodo(id);
    }
}
