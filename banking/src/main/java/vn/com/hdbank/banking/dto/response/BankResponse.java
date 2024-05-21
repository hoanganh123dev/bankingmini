package vn.com.hdbank.banking.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.hdbank.banking.dto.AccountInfo;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
