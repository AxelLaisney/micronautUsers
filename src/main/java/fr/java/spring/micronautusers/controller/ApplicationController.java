package fr.java.spring.micronautusers.controller;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

import java.util.List;
import java.util.Optional;

import fr.java.micronautusers.model.Users;
import fr.java.microserviceusers.dao.UsersRepository;

//Define with which path this controller should be used
@Controller("/users")

public class ApplicationController {

   private UsersRepository usersRepository; 
   
   //By default, the controller return all users
   @Get 
   public List<Users> getAllUsers(){
       return usersRepository.findAll();
   }
   
   //if specified in the path, return a user based on an id
   @Get("/id/{id}")
   public Optional<Users> getUserById(int id){
      return usersRepository.findById(id);
   }

   //add a user with a post request
   @Post("/user")
   public String addUser(Users user){
      usersRepository.save(user);
      return "A user has been added";
   }

   //delete a user with a post request
   @Post("/delete")
   public String deleteUser(int id){
      usersRepository.deleteById(id);
      return "a user has been deleted";
   }
}
