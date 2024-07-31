public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy payPal = new PayPalPayment("user@example.com");

        context.setPaymentStrategy(creditCard);
        context.executePayment(100.00);

        context.setPaymentStrategy(payPal);
        context.executePayment(200.00);
    }
}
