# Cake Shop — Strategy Pattern

## Project Description

This Java application demonstrates the Strategy behavioral design pattern.

A cake order can use different pricing algorithms. The client can change
the pricing strategy at runtime without creating a new order.

## Pattern Components

| Component | Implementation |
|---|---|
| Strategy | PricingStrategy |
| Concrete Strategy | RegularPricingStrategy |
| Concrete Strategy | BulkPricingStrategy |
| Concrete Strategy | HolidayPricingStrategy |
| Context | CakeOrder |
| Client | Main |

## Pricing Algorithms

- RegularPricingStrategy calculates the full price.
- BulkPricingStrategy applies a 20% discount to orders of at least 5 cakes.
- HolidayPricingStrategy applies a 10% discount.

Prices are represented as whole KZT amounts.
Integer division truncates fractional discount amounts.

## Runtime Strategy Switching

Main creates one CakeOrder and changes its strategy using
setPricingStrategy().

CakeOrder delegates calculation to the selected strategy through the
PricingStrategy interface. It does not use if/switch statements to select
a strategy type.

## Clean Code Principles

1. Single Responsibility Principle:
   Each strategy implements one pricing algorithm.
   CakeOrder stores order data and delegates pricing.

2. Meaningful Names:
   Names such as BulkPricingStrategy and calculateTotal clearly describe
   their purpose.

3. Encapsulation:
   Fields are private. Order price and quantity are final.
   The strategy is changed through a public method.

4. Polymorphism:
   CakeOrder calls calculateTotal() through the PricingStrategy interface
   instead of checking concrete strategy types.

5. Open/Closed Principle:
   A new pricing strategy can be added by implementing PricingStrategy.
   Existing strategies and CakeOrder do not need to change.
   The client can select the new implementation.

6. Dependency Inversion Principle:
   CakeOrder depends on the PricingStrategy abstraction rather than
   concrete pricing classes.

7. Small, Focused Classes:
   Each class has a clear purpose and a small number of methods.

## Extensibility Example

To add a loyalty discount, create LoyaltyPricingStrategy implementing
PricingStrategy, then select it in Main.

CakeOrder and the existing strategies remain unchanged.

## How to Run

Open the project in IntelliJ IDEA and run Main.java.

Alternatively, from the project root:

javac -d out src/*.java
java -cp out Main

## Expected Output

Cake Shop - Strategy Pattern
Price per cake: 10000 KZT
Quantity: 5

Regular price: 50000 KZT
Bulk price: 40000 KZT
Holiday price: 45000 KZT