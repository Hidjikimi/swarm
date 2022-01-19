package ua.com.iasoft.swarm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.iasoft.swarm.Entities.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
