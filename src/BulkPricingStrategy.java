public class BulkPricingStrategy implements PricingStrategy {

    private static final int MINIMUM_QUANTITY = 5;
    private static final int DISCOUNT_PERCENT = 20;

    @Override
    public int calculateTotal(int unitPrice, int quantity) {
        int subtotal = unitPrice * quantity;

        if (quantity >= MINIMUM_QUANTITY) {
            return subtotal - subtotal * DISCOUNT_PERCENT / 100;
        }

        return subtotal;
    }
}