package ru.gb.qalex.userbase;

import org.springframework.transaction.annotation.Transactional;
import ru.gb.qalex.userbase.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void registerNewBornUser() {

        User alex = userService.registerNewUser("Alex", "alex@mail.ru");
        Assertions.assertNotNull(alex);

        User onceAgain = userService.getById(alex.getId());
        Assertions.assertNotNull(onceAgain);

    }
}
