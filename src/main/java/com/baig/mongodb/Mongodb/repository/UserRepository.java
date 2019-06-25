package com.baig.mongodb.Mongodb.repository;

import com.baig.mongodb.Mongodb.document.MyUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<MyUser, Integer> {

}
