package ru.gb.qalex.userbase;

import ru.gb.qalex.userbase.model.User;
import ru.gb.qalex.userbase.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User registerNewUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(0L);
        user.setEmail(email);

        return userRepository.save(user);

    }

    public User getById(Long id) {
        return userRepository.getOne(id);


    }
}
