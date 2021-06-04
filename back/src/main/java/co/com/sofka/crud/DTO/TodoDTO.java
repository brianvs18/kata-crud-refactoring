package co.com.sofka.crud.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class TodoDTO {
    /* Los DTO (Data Transfer Object) como lo indica su nombre son objetos para transportar datos
        que pueden ser enviados o reuperados por el servidor en una sola invocacion

        Un DTO puede contener informacion de diferentes tablas en una unica clase

        @NotBlank para indicar que el campo no puede ingresar vacio
     */

    private Long id;
    @NotBlank
    private String name;
    private boolean completed;

    public TodoDTO() {
    }

    public TodoDTO(Long id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }
}
