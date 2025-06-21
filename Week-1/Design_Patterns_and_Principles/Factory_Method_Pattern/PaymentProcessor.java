public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println(" Payment method not selected.");
        } else {
            strategy.pay(amount);
        }
    }
}
