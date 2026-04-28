package code.bai16;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by Cash");

    }
}
