package code.bai16;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by Card");
    }
}
