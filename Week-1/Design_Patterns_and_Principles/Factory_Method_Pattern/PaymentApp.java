public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CreditCardPayment());
        processor.processPayment(1200.50);

        processor.setStrategy(new PayPalPayment());
        processor.processPayment(850.75);

        processor.setStrategy(new UPIPayment());
        processor.processPayment(500.00);
    }
}
