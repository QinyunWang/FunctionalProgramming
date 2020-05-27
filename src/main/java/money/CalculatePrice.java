package money;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.Function;

@Component
public class CalculatePrice {

    public BigDecimal apply(BigDecimal amount,
                            Function<BigDecimal, BigDecimal> applyDiscount,
                            Function<BigDecimal, BigDecimal> applyTax) {
        return applyTax.compose(applyDiscount).apply(amount);
    }
}
