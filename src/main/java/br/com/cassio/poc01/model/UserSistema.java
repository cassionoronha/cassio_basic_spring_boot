package br.com.cassio.poc01.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter @Setter
@Entity
public class UserSistema {

    @Id
    @GeneratedValue
    private Long id_user;
    private String username;
    private String email;
    private String password;
}
