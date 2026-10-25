public interface PricingStrategy {

    int calculateTotal(int unitPrice, int quantity);
}