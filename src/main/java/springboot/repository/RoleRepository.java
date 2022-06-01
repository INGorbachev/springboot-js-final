package springboot.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
