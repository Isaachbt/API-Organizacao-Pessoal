package org.com.apiorganizacaopessoal.repositorio;

import org.com.apiorganizacaopessoal.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {

    @Override
    boolean existsById(UUID uuid);
    Optional<Task> findById(UUID uuid);
}
