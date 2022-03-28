package academy.kata.platform.spring.spring_boot_security_bootstrap.dao;

import academy.kata.platform.spring.spring_boot_security_bootstrap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserById(long id);

}
