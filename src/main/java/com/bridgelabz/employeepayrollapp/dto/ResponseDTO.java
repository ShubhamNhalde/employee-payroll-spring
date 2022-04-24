package com.bridgelabz.employeepayrollapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String messsage;
    private Object data;

    public ResponseDTO(String messsage, Object data) {
        this.messsage = messsage;
        this.data = data;
    }

}
