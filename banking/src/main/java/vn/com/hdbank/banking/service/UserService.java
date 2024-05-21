package vn.com.hdbank.banking.service;

import vn.com.hdbank.banking.dto.LoginDto;
import vn.com.hdbank.banking.dto.request.CreditDebitRequest;
import vn.com.hdbank.banking.dto.request.EnquiryRequest;
import vn.com.hdbank.banking.dto.request.TransferRequest;
import vn.com.hdbank.banking.dto.response.BankResponse;
import vn.com.hdbank.banking.dto.request.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest request);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);
    BankResponse login(LoginDto loginDto);
}
