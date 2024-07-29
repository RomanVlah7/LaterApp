package ru.practicum.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private static Repository userRepository = new Repository();

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return null;
    }
}
