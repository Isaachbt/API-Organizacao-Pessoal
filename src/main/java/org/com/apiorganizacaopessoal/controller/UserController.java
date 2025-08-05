package org.com.apiorganizacaopessoal.controller;

import org.com.apiorganizacaopessoal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;


}
