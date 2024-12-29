package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    void add(User user);

    void update(User user, List<Role> roles);

    User getUserById(Long id);

    void delete(long id);

    User findById(Long id);

    User findByUsername(String username);

    void saveUser(User user, List<Role> roles);
}
