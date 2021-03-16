package fr.java.microserviceusers.dao;

import java.util.List;
import java.util.Optional;

import fr.java.micronautusers.model.Users;

//Repository for basic CRUD interactions
public interface UsersRepository{
    

    Optional <Users> findById(int id);

    Users save(Users user);

    void deleteById(int id);

    List<Users> findAll(SortingAndOrderArguments args);

    int update(int id, Users user);
    
}
