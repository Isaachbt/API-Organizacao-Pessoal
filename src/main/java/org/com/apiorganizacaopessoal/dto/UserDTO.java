package org.com.apiorganizacaopessoal.dto;

import org.com.apiorganizacaopessoal.entity.Role;

public record UserDTO(String email, String senha, Role role) {
}
