
// PaymentGateways.java
class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

class Stripe {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}

class Square {
    public void processTransaction(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }
}