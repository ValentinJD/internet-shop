package ru.internet.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.internet.shop.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
