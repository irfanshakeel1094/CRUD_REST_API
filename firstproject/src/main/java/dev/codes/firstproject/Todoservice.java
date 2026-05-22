package dev.codes.firstproject;

import dev.codes.firstproject.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Todoservice {
    @Autowired
    private Todorepository todorepository;
    public Todo createtodo(Todo todo){
    return todorepository.save(todo);
    }
    public Todo gettodo(Long id){
        return todorepository.findById(id).orElseThrow(()-> new RuntimeException("Todo not found with id "+id));
    }
    public List<Todo> gettodo(){
        return todorepository.findAll();
    }
    public Todo updatetodo(Todo todo){
        return todorepository.save(todo);
    }
    public void deletetodoByid(Long id){
        todorepository.deleteById(id);
    }

}
