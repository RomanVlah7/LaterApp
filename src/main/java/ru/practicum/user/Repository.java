package ru.practicum.user;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository

public class Repository implements UserRepository {

    private static Map<Long, User> users;
    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }
}
