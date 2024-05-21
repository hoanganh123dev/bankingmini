package vn.com.hdbank.banking.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.com.hdbank.banking.dto.LoginDto;
import vn.com.hdbank.banking.dto.request.CreditDebitRequest;
import vn.com.hdbank.banking.dto.request.EnquiryRequest;
import vn.com.hdbank.banking.dto.request.TransferRequest;
import vn.com.hdbank.banking.dto.response.BankResponse;
import vn.com.hdbank.banking.dto.request.UserRequest;
import vn.com.hdbank.banking.service.UserService;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User account Management APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Create New User account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http status 201 CREATED"
    )

    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest request){
        return userService.createAccount(request);
    }

    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }
    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, check how much the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )

    @GetMapping("balanceEnquiy")
    public BankResponse balanceEnquiy(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }

    @GetMapping("nameEnquiry")
    public String NameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userService.transfer(request);
    }
}
