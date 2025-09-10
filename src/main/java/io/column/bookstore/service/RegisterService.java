package io.column.bookstore.service;

import io.column.bookstore.model.User;
import org.springframework.stereotype.Service;
import io.column.bookstore.repository.UserRepository;

@Service
public class RegisterService {
    public final UserRepository userRepository;

    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }
}
