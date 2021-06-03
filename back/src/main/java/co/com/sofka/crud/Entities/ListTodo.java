package co.com.sofka.crud.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "listTodo")
public class ListTodo {

    /*
     *Le agrego una List donde le envio el objeto a la entidad ListTodo
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nameList;

    private List<Todo> listTodo;

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

    @OneToMany(mappedBy = "listTodo")
    public List<Todo> listTodo() {
        return listTodo;
    }

    public void savelistTodo(List<Todo> listTodo) {
        this.listTodo = listTodo;
    }
}