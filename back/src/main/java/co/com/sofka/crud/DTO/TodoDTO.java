package co.com.sofka.crud.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoDTO {
    /* Los DTO (Data Transfer Object) como lo indica su nombre son objetos para transportar datos
        que pueden ser enviados o reuperados por el servidor en una sola invocacion

        Un DTO puede contener informacion de diferentes tablas en una unica clase
     */

    private Long id;
    private String name;
    private boolean completed;

}
