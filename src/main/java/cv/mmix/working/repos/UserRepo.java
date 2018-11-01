package cv.mmix.working.repos;

import cv.mmix.working.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User, Long> {

//    User findByEmail(String email);
    User findByUsername(String username);
}
