package vn.com.hdbank.banking.controller;

import com.itextpdf.text.DocumentException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.hdbank.banking.entity.Transaction;
import vn.com.hdbank.banking.service.impl.BankStatement;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bankStatement")
public class TrasactionController {

    private BankStatement bankStatement;

    @GetMapping
    public List<Transaction> generateBankStaement(@RequestParam String accountNumber,
                                                  @RequestParam String startDate,
                                                  @RequestParam String endDate) throws DocumentException, FileNotFoundException {
        return bankStatement.generateStatement(accountNumber, startDate, endDate);
    }
}
