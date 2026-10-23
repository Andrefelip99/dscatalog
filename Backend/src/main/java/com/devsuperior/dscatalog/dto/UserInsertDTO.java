package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserInsertValid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@UserInsertValid
public class UserInsertDTO extends UserDTO {
    private static final long serialVersionUID = 1L;
    @NotBlank(message = "Campo Obrigatorio")
    @Pattern (regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Senha deve conter pelo menos uma letra maiuscula, uma letra minuscula, um numero e um caractere especial")
    @Size (min = 8, message = "Senha deve ter no minimo 8 caracteres")
    private String password;

    public UserInsertDTO() {
        super();
    }

}
