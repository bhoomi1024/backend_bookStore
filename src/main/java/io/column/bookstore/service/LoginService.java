package io.column.bookstore.service;

import io.column.bookstore.model.User;
import org.springframework.stereotype.Service;
import io.column.bookstore.repository.UserRepository;

import java.util.Optional;

@Service
public class LoginService {
    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}
