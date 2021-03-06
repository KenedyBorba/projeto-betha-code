package com.betha.agendaempresas.agenda.enterprise;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public class ValidationException extends Exception{

    public static final long serialVersionUID = 1L;

    public ValidationException(String message) {
        super(message);
    }
}
