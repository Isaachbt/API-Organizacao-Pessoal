package org.com.apiorganizacaopessoal.dto;

import org.com.apiorganizacaopessoal.entity.PrioridadeTask;

import java.time.LocalDateTime;

public record TaskDTO(String titulo, String descricao, PrioridadeTask prioridade, boolean completa, LocalDateTime dataCriacao, LocalDateTime dataConclusao) {
}
