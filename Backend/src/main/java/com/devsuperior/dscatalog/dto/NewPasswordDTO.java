package com.devsuperior.dscatalog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewPasswordDTO {
    @NotBlank(message = "Campo obrigatorio")
    private String token;

    @NotBlank
    @Size(min = 8, message = " Deve ter no min 8 caracteres ")
    private String password;

}
