package co.com.sofka.crud.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "listTodo")
public class ListTodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nameList;
    private Set<Todo> todoSet = new HashSet<>();

    public Integer Id() {
        return Id;
    }

    public void saveId(Integer id) {
        Id = id;
    }

    public String NameList() {
        return nameList;
    }

    public void saveNameList(String nameList) {
        this.nameList = nameList;
    }

    public Set<Todo> TodoSet() {
        return todoSet;
    }

    public void saveTodoSet(Set<Todo> todoSet) {
        this.todoSet = todoSet;
    }
}