package org.com.apiorganizacaopessoal.service;

import org.com.apiorganizacaopessoal.entity.Usuario;

public interface UserService {

    boolean emailExists(String email);
    String login(Usuario usuario);
    String register(Usuario usuario);

}
