package org.com.apiorganizacaopessoal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotNull
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataConclusao;
    @NotNull
    @Enumerated(EnumType.STRING)
    private PrioridadeTask prioridade;

}
