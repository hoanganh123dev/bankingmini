package vn.com.hdbank.banking.service;

import vn.com.hdbank.banking.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
