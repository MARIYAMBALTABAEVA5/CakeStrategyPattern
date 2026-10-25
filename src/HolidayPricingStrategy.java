public class HolidayPricingStrategy implements PricingStrategy {

    private static final int DISCOUNT_PERCENT = 10;

    @Override
    public int calculateTotal(int unitPrice, int quantity) {
        int subtotal = unitPrice * quantity;

        return subtotal - subtotal * DISCOUNT_PERCENT / 100;
    }
}