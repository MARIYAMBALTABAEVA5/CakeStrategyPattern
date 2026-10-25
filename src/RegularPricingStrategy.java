public class RegularPricingStrategy implements PricingStrategy {

    @Override
    public int calculateTotal(int unitPrice, int quantity) {
        return unitPrice * quantity;
    }
}