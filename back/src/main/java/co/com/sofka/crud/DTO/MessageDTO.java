package co.com.sofka.crud.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Esta clase es para mostrar los mensajes en el front
public class MessageDTO {

    private  Object object;
    private String message;

    public MessageDTO(Object object, String message) {
        this.object = object;
        this.message = message;
    }

    public MessageDTO(Object object) {
        this.object = object;
    }
}
