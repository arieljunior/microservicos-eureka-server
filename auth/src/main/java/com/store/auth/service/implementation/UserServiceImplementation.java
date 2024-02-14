package com.store.auth.service.implementation;

import com.store.auth.domain.User;
import com.store.auth.repository.UserRepository;
import com.store.auth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation extends GenericServiceImplementation<User, Long, UserRepository> implements UserService {

    public UserServiceImplementation(UserRepository repository){
        super(repository);
    }
}
