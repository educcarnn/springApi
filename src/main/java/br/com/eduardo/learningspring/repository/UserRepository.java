package br.com.eduardo.learningspring.repository;

import br.com.eduardo.learningspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
