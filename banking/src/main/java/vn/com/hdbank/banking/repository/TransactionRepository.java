package vn.com.hdbank.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.hdbank.banking.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
