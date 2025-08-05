package org.com.apiorganizacaopessoal.controller;

import jakarta.validation.Valid;
import org.com.apiorganizacaopessoal.dto.TaskDTO;
import org.com.apiorganizacaopessoal.entity.Task;
import org.com.apiorganizacaopessoal.service.TaskService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks/")
public class TaskController {
    @Autowired
    private TaskService taskService;


    @PostMapping("save")
    public ResponseEntity<Object> save(@RequestBody  @Valid TaskDTO dto) {

        var task = new Task();
        BeanUtils.copyProperties(dto, task);

        try {
            taskService.save(task);
            return ResponseEntity.ok("Tarefa salva com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(409).body("Erro ao tentar salvar a tarefa: " + e.getMessage());
        }

    }
}
