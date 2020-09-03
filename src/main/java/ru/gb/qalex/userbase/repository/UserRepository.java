package ru.gb.qalex.userbase.repository;

import ru.gb.qalex.userbase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

        List<User> findAllByNameContaining (String name);
        List<User> findAllByAgeGreaterThan(Long minAge, Long maxAge);
}
