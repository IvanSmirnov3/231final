package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    void addUser(User user);
    void deleteByIdUser(Long id);
    void updateUser(User user);
    User findByIdUser(Long id);
}
