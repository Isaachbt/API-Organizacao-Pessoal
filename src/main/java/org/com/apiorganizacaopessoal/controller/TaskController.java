package org.com.apiorganizacaopessoal.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.com.apiorganizacaopessoal.dto.TaskDTO;
import org.com.apiorganizacaopessoal.entity.Task;
import org.com.apiorganizacaopessoal.service.TaskService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("findAll")
    public ResponseEntity<List<Task>> findAll() {

        List<Task> tasks = taskService.listALl();
        if (tasks.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tasks);

    }

    @GetMapping("findById/{id}")
    public  ResponseEntity<Task> findById(@PathVariable(value = "id") @NotNull UUID id) {
        try {
            Task task = taskService.findById(id);
            return ResponseEntity.ok(task);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") @NotNull UUID id){

        try {
            taskService.deleteById(id);
            return ResponseEntity.ok("Tarefa deletada com sucesso.");
        }catch (IllegalArgumentException e) {
            return ResponseEntity.status(404).body("Tarefa não encontrada com o ID: " + id);
        }
    }
}
