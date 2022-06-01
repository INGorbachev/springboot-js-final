package springboot.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    void deleteById(Long id);
}
