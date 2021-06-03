package co.com.sofka.crud.Abstracts;

import co.com.sofka.crud.Entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <Todo, Long> {
}
