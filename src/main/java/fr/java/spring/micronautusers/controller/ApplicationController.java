package fr.java.spring.micronautusers.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/users")

public class ApplicationController {

   @Get 
   public Iterable getAllUsers(){
       
   }
    
}
