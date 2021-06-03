package co.com.sofka.crud.DTO;

public class TodoDTO {
    /* Los DTO (Data Transfer Object) como lo indica su nombre son objetos para transportar datos
        que pueden ser enviados o reuperados por el servidor en una sola invocacion

        Un DTO puede contener informacion de diferentes tablas en una unica clase
     */

    private Long id;
    private String name;
    private boolean completed;

    public Long Id() {
        return id;
    }

    public void saveId(Long id) {
        this.id = id;
    }

    public String Name() {
        return name;
    }

    public void saveName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void saveCompleted(boolean completed) {
        this.completed = completed;
    }
}
