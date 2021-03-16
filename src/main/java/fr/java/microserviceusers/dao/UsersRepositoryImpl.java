package fr.java.microserviceusers;

import java.util.List;
import java.util.Optional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fr.java.micronautusers.model.Users;
import fr.java.microserviceusers.dao.UsersRepository;
import io.micronaut.runtime.ApplicationConfiguration;
import io.micronaut.spring.tx.annotation.Transactional;
import io.micronaut.transaction.annotation.ReadOnly;

//Repository where CRUD intereractions are defined
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

@Override
@Transactional
public String save(Users user){
    entityManager.persist(user);
    return "A user as been added";
}

@Override
@Transactional
public void deleteById(int id) {
    findById(id).ifPresent(entityManager::remove);
}

@ReadOnly
public List<Users> findAll(){
    String qlString = "SELECT * FROM users";
    TypedQuery<Users> query = entityManager.createQuery(qlString, Users.class);
    return query.getResultList();
}




