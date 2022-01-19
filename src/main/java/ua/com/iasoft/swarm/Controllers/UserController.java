package ua.com.iasoft.swarm.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.iasoft.swarm.Entities.User;
import ua.com.iasoft.swarm.Repositories.UserRepository;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsersIds() {
        return userRepository.findAll();
    }
}
