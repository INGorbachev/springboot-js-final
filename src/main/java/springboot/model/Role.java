package springboot.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    private String roleName;

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role(String roleName) {
        if (roleName.contains("ADMIN")) {
            this.id = 1L;
        } else if (roleName.contains("USER")) {
            this.id = 2L;
        }
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {

        return roleName;
    }

    @Override
    public String toString() {

        return roleName;
    }
}
