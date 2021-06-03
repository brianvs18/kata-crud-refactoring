package co.com.sofka.crud.Entities;

import javax.persistence.*;

@Entity
@Table(name="todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean completed;
    private ListTodo listTodo;

    public ListTodo getListTodo() {
        return listTodo;
    }

    public void setListTodo(ListTodo listTodo) {
        this.listTodo = listTodo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
