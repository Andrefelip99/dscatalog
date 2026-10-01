package com.devsuperior.dscatalog.resource.exeptions;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fildName;
    private String message;
    public FieldMessage(String fildName, String message) {
        this.fildName = fildName;
        this.message = message;
    }

    

}
