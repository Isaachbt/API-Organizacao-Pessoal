package org.com.apiorganizacaopessoal.service.imp;

import org.com.apiorganizacaopessoal.entity.Usuario;
import org.com.apiorganizacaopessoal.repositorio.UserRepository;
import org.com.apiorganizacaopessoal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean emailExists(String email) {
        return false;
    }

    @Override
    public String login(Usuario usuario) {
        return "";
    }

    @Override
    public String register(Usuario usuario) {
        return "";
    }
}
