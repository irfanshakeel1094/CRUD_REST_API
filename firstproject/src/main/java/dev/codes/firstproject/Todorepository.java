package dev.codes.firstproject;

import dev.codes.firstproject.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaParameters;
import org.springframework.stereotype.Component;

public interface Todorepository extends JpaRepository<Todo, Long> {

}
