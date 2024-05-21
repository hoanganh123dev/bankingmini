package vn.com.hdbank.banking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.hdbank.banking.dto.TransactionDto;
import vn.com.hdbank.banking.entity.Transaction;
import vn.com.hdbank.banking.repository.TransactionRepository;
import vn.com.hdbank.banking.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .status("SUCCESS")
                .amount(transactionDto.getAmount())
                .accountNumber(transactionDto.getAccountNumber())
                .transactionType(transactionDto.getTransactionType())
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction Saved successfully");
    }
}
