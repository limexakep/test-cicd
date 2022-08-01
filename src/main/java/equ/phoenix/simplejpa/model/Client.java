package equ.phoenix.simplejpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
