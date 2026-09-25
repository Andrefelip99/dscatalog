package com.devsuperior.dscatalog.resource.exeptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fildName;
    private String message;

}
