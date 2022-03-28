package academy.kata.platform.spring.spring_boot_security_bootstrap.service;

import academy.kata.platform.spring.spring_boot_security_bootstrap.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    List<Role> getAllRoles();

    Role findRoleById(long id);

    Role findRoleByRole(String roleName);

    void saveOrUpdate(Role role);

    void removeRoleById(long id);

}
