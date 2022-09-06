package tech.reliab.course.berezhnayaa.bank.entity;

public class PaymentAccount {

    public int idPaymentAccount; // Id платёжного счета
    public String userPaymentAccount;  // Пользователь, за которым закреплен этот платежный счет
    public String bankPaymentAccount;  // Название банка, в котором открыт этот счет
    public int sumPaymentAccount;  // Сумма, которая лежит в данный момент на счету

    public PaymentAccount(int idPaymentAccount, String userPaymentAccount, String bankPaymentAccount, int sumPaymentAccount) {
        this.idPaymentAccount = idPaymentAccount;
        this.userPaymentAccount = userPaymentAccount;
        this.bankPaymentAccount = bankPaymentAccount;
        this.sumPaymentAccount = sumPaymentAccount;

    }
}
