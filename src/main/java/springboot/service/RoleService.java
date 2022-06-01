package springboot.service;

import springboot.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();
    void addRole(Role role);
}
