package co.com.sofka.crud.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Esta clase es para mostrar los mensajes en el front
public class MessageDTO {

    private String message;

    public MessageDTO(String message) {
        this.message = message;
    }
}
