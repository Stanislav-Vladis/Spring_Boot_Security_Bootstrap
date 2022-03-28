package academy.kata.platform.spring.spring_boot_security_bootstrap.service;

import academy.kata.platform.spring.spring_boot_security_bootstrap.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User findUserById(long id);

    User findUserByUsername(String username);

    void saveOrUpdate(User user);

    void removeUserById(long id);

}
