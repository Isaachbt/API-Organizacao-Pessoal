package org.com.apiorganizacaopessoal.dto;

import org.com.apiorganizacaopessoal.entity.PrioridadeTask;
import org.com.apiorganizacaopessoal.entity.Usuario;

public record TaskDTO(String titulo, String descricao, PrioridadeTask prioridade, boolean completa) {
}
