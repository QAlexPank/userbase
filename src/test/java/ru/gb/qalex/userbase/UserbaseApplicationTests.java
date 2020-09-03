package ru.gb.qalex.userbase;

import ru.gb.qalex.userbase.model.User;
import ru.gb.qalex.userbase.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class UserbaseApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        User one = userRepository.getOne(1L);
        List<User> all = userRepository.findAllByAgeGreaterThan(18L,90L);
        Assertions.assertEquals("Anton",one.getName());
        Assertions.assertEquals(1, all.size());
    }
}
