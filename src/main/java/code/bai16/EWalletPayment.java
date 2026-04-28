package code.bai16;

public class EWalletPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by E-Wallet");
    }
}
