package academy.kata.platform.spring.spring_boot_security_bootstrap.dao;

import academy.kata.platform.spring.spring_boot_security_bootstrap.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByRole(String roleName);

    Role findRoleById(long id);

}
