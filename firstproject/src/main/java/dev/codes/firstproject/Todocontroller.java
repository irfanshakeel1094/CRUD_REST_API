package dev.codes.firstproject;

import dev.codes.firstproject.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Todocontroller {
    @Autowired
    private Todoservice todoservice;
    @GetMapping("/get")
    String control(){
    return "todo";
    }

        @GetMapping("/hello")
        String display(){
            return "Hello World";
        }
        @GetMapping("/hi")
        String display1(){
            return "HI Buddy";
        }
//        @GetMapping("/{id}")
//        String getoday(@PathVariable long id){
//            return "today is "+ id;
//        }
        @GetMapping("")
        String getodo(@RequestParam("todoid") String id){
            return "todo id with "+ id;
        }

        @GetMapping("/loggin")
        String createlogin(@RequestParam String username, @RequestParam String password){
            return "created username "+ username +" password "+password;
        }

        @GetMapping("/todo/")
        ResponseEntity<List<Todo>>gettodo(){
            return new ResponseEntity<List<Todo>>(todoservice.gettodo(),HttpStatus.OK);
        }

        @GetMapping("/fuckyou")
        String optionalparam(@RequestParam(defaultValue = "bitch") String obj){
            return "Fuck you"+ obj;
        }
    @PostMapping("/create")
    ResponseEntity<Todo> createuser(@RequestBody Todo todo){
        try{
            Todo createdtodo =todoservice.createtodo(todo);
            return new ResponseEntity<>(createdtodo,HttpStatus.CREATED);
        }catch(RuntimeException exception){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }}
    @GetMapping("/todo/{id}")
    ResponseEntity<Todo> gettodobyid(@PathVariable long id){
        try{
            Todo gettodo = todoservice.gettodo(id);
            return new ResponseEntity<>(gettodo, HttpStatus.OK);
        }catch(RuntimeException exception){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update/{id}")
    ResponseEntity<Todo> updatebytodo(@RequestBody Todo todo){
        return new ResponseEntity<>(todoservice.updatetodo(todo),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    void deletetodoByid(@PathVariable Long id){
        todoservice.deletetodoByid(id);
    }

}
