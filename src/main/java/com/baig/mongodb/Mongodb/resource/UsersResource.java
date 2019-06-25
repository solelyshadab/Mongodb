package com.baig.mongodb.Mongodb.resource;

import com.baig.mongodb.Mongodb.document.MyUser;
import com.baig.mongodb.Mongodb.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<MyUser> getAll(){
        return userRepository.findAll();
    }


}
