package money;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class MoneyApplication implements CommandLineRunner {
    private final Application application;

    MoneyApplication(Application application) {
        this.application = application;
    }

    public static void main(String[] args) {
        SpringApplication.run(MoneyApplication.class, args);
    }

    @Override
    public void run(String... args) {
        BigDecimal listingPrice = new BigDecimal(100);
        System.out.println(application.run(listingPrice));
    }
}
