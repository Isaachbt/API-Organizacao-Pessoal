package org.com.apiorganizacaopessoal.service.imp;

import org.com.apiorganizacaopessoal.entity.Task;
import org.com.apiorganizacaopessoal.repositorio.TaskRepository;
import org.com.apiorganizacaopessoal.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskServiceImp implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void save(Task task) {

        try {
            taskRepository.save(task);
        }catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public void update(Task task) {

        if (!taskRepository.existsById(task.getId()))
            throw new IllegalArgumentException("Tarefa não encontrada");

        try {
            taskRepository.save(task);
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao atualizar a tarefa: " + e.getMessage());
        }

    }

    @Override
    public List<Task> listALl() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(UUID id) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isEmpty())
            throw new IllegalArgumentException("Tarefa não encontrada com o ID: " + id);

        return task.get();
    }

    @Override
    public boolean existById(UUID uuid) {
        return taskRepository.existsById(uuid);
    }

    @Override
    public void deleteById(UUID uuid) {
        if (!taskRepository.existsById(uuid))
            throw new IllegalArgumentException("Tarefa não encontrada com o ID: " + uuid);

        taskRepository.deleteById(uuid);


    }
}
