package fr.java.microserviceusers;

import java.util.Optional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;

import fr.java.micronautusers.model.Users;
import fr.java.microserviceusers.dao.UsersRepository;
import io.micronaut.runtime.ApplicationConfiguration;
import io.micronaut.transaction.annotation.ReadOnly;

@Singleton
public class UsersRepositoryImpl implements UsersRepository {
    private final EntityManager entityManager;
    private final ApplicationConfiguration applicationConfiguration;

    public UsersRepositoryImpl(EntityManager entityManager,
                                ApplicationConfiguration applicationConfiguration) {
        this.entityManager = entityManager;
        this.applicationConfiguration = applicationConfiguration;
                                }
}

@Override

public Optional<Users> findById(int id){
    return Optional(entityManager.find(Users.class, id));
}



