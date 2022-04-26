package com.bridgelabz.employeepayrollapp.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ResponseDTO {
    private String messsage;
    private Object data;

    public ResponseDTO(String messsage, Object data) {
        super();
        this.messsage = messsage;
        this.data = data;
    }

}
