package com.coursejava.projetomongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.coursejava.projetomongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
