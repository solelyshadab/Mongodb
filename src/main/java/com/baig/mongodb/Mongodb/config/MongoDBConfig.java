package com.baig.mongodb.Mongodb.config;


import com.baig.mongodb.Mongodb.document.MyUser;
import com.baig.mongodb.Mongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return (args) -> {
            userRepository.save(new MyUser(1, "Peter", "Development", 3000L));
            userRepository.save(new MyUser(2, "Sam", "Operation", 2000L));
        };
    }
}
