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

    }

    @Override
    public List<Optional<Task>> listALl() {
        return List.of();
    }

    @Override
    public Task findById(UUID id) {
        return null;
    }

    @Override
    public boolean existById(UUID uuid) {
        return taskRepository.existsById(uuid);
    }
}
