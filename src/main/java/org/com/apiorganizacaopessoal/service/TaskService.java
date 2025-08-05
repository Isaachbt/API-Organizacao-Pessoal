package org.com.apiorganizacaopessoal.service;

import org.com.apiorganizacaopessoal.entity.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {

    void save(Task task);
    void update(Task task);
    List<Optional<Task>> listALl();
    Task findById(UUID id);
    boolean existById(UUID uuid);

}
