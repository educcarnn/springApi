package br.com.eduardo.learningspring.repository;

import br.com.eduardo.learningspring.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
