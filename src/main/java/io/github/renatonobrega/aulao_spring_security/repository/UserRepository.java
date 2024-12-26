package io.github.renatonobrega.aulao_spring_security.repository;

import io.github.renatonobrega.aulao_spring_security.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}
