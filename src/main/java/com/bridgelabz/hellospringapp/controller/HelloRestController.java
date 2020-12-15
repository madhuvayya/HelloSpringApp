package com.bridgelabz.hellospringapp.controller;

import com.bridgelabz.hellospringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"","/","/home"})
    public String sayHello() {
        return "Hello from Bridgelabz!!!";
    }

    @RequestMapping(value = {"query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+ name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping(value = {"/post"})
    public String sayHello(@RequestBody User user){
        return "Hello "+ user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping ( "/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello "+ firstName + " "+ lastName + "!";
    }

}
