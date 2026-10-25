public class Main {

    public static void main(String[] args) {
        CakeOrder order = new CakeOrder(
                10000,
                5,
                new RegularPricingStrategy()
        );

        System.out.println("Cake Shop - Strategy Pattern");
        System.out.println("Price per cake: 10000 KZT");
        System.out.println("Quantity: 5");
        System.out.println();

        System.out.println(
                "Regular price: " + order.calculateTotal() + " KZT"
        );

        order.setPricingStrategy(new BulkPricingStrategy());

        System.out.println(
                "Bulk price: " + order.calculateTotal() + " KZT"
        );

        order.setPricingStrategy(new HolidayPricingStrategy());

        System.out.println(
                "Holiday price: " + order.calculateTotal() + " KZT"
        );
    }
}