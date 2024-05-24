package ru.chernyshev.PP_3_1_2.service;

import ru.chernyshev.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User show(Long id);

    public void save(User user);

    public void update(Long id, User updatedUser);

    public void delete(Long id);
}
