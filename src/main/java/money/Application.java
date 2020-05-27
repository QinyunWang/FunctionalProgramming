package money;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.Function;

@Component("Application")
public class Application {
    public final CalculatePrice calculateFinalPriceForListingPrice;

    public Application(CalculatePrice calculateFinalPriceForListingPrice) {
        this.calculateFinalPriceForListingPrice = calculateFinalPriceForListingPrice;
    }

    public BigDecimal run(BigDecimal listingPrice) {
        return calculateFinalPriceForListingPrice.apply(listingPrice,);
    }
}
