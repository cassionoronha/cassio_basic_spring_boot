package br.com.cassio.poc01.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Data
@Getter @Setter
public class UserSistema {

    @Id
    private String username;
    private String email;
    private String password;
}
