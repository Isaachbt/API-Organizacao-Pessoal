package org.com.apiorganizacaopessoal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_user")
public class Usuario {

    @Id
    private UUID id;
    private String email;
    @JsonIgnore
    private String senha;
    private Integer seqDiasConsecutivos;
    @Enumerated(EnumType.STRING)
    private Role role;

}
