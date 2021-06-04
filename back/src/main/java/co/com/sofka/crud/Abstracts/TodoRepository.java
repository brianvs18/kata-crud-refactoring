package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.DTO.TodoDTO;
import co.com.sofka.crud.Entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
