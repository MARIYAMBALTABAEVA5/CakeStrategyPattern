import java.util.Objects;

public class CakeOrder {

    private final int unitPrice;
    private final int quantity;
    private PricingStrategy pricingStrategy;

    public CakeOrder(
            int unitPrice,
            int quantity,
            PricingStrategy pricingStrategy
    ) {
        if (unitPrice <= 0 || quantity <= 0) {
            throw new IllegalArgumentException(
                    "Price and quantity must be positive."
            );
        }

        this.unitPrice = unitPrice;
        this.quantity = quantity;
        setPricingStrategy(pricingStrategy);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = Objects.requireNonNull(
                pricingStrategy,
                "Pricing strategy must not be null."
        );
    }

    public int calculateTotal() {
        return pricingStrategy.calculateTotal(unitPrice, quantity);
    }
}