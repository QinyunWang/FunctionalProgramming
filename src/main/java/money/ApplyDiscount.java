package money;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.Function;

@Component
public class ApplyDiscount implements Function<BigDecimal, BigDecimal> {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.doubleValue() > 100 ? amount.add(amount.multiply(BigDecimal.valueOf(2.0)).negate()) : amount;
    }
}
