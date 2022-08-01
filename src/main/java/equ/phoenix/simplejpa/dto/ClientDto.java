package equ.phoenix.simplejpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientDto {
    private String name;
    private String lastName;
    private String email;
    private String password;
}
