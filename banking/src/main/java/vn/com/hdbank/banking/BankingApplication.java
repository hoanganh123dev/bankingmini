package vn.com.hdbank.banking;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Bank App ",
				description = "Backend Rest APIs for mini Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Phan Hoàng Anh",
						email = "hoanganhphan294@gmail.com",
						url = "http"
				),
				license = @License(
						name = "Bank App",
						url = "http"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Java bank app documention",
				url = "http"
		)
)
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
