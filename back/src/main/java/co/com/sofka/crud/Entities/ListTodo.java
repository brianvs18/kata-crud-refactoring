package co.com.sofka.crud.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "listTodo")
public class ListTodo {

    /*
         *Le agrego una List donde le envio el objeto a la entidad ListTodo
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nameList;

    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Todo> todoList;

}