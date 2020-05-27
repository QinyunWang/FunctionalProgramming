package money;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.Function;

@Component
public class ApplyTax implements Function<BigDecimal, BigDecimal> {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.add(amount.multiply(BigDecimal.valueOf(1.0)));
    }
}
