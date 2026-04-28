package code.bai16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new CardPayment());
        payments.add(new CashPayment());
        payments.add(new EWalletPayment());
        for (Payment payment : payments) {
            payment.pay(500);
        }
    }
    //Polymorphism nếu sinhVienIT extend Sinhvien + implement Du hoc, hocbong
    //Bien tham chieu kieu nao thi dung method kieu do
    //SinhVien it (kieu tham chieu) = new SinhVienIT   sv.nhanhocbong // sai (Cohocbong)sv.nhanhocbong :)))
}
