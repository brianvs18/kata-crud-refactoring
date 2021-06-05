package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.Entities.ListTodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListTodoRepository extends JpaRepository<ListTodo, Integer> {
}
