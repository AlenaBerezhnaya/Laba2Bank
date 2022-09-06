package tech.reliab.course.berezhnayaa.bank.entity;

import java.util.Date;

public class CreditAccount {

    public int idCreditAccount; // Id кредитного счета
    public String userCreditAccount;  // Пользователь, за которым закреплен этот кредитный счет
    public String bankCreditAccount;  // Название банка, где взят кредит
    public Date dateBeginCreditAccount;  // Дата начала кредита
    public Date dateEndCreditAccount;  // Дата окончания кредита
    public int monthCreditAccount;  // Кол-во месяцев, на которые взят кредит
    public int creditSumCreditAccount;  // Сумма кредита
    public int paymentCreditAccount;  // Ежемесячный платеж
    public int interestRateCreditAccount;  // Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже)
    public String employeeCreditAccount;  // Сотрудник, который выдал кредит
    public int paymentAccountCreditAccount;  // Платежный счет в банке с которого будет осуществляться погашение данного кредита

    public CreditAccount(int idCreditAccount, String userCreditAccount, String bankCreditAccount, Date dateBeginCreditAccount, Date dateEndCreditAccount, int monthCreditAccount, int creditSumCreditAccount, int paymentCreditAccount, int interestRateCreditAccount, String employeeCreditAccount, int paymentAccountCreditAccount) {
        this.idCreditAccount = idCreditAccount;
        this.userCreditAccount = userCreditAccount;
        this.bankCreditAccount = bankCreditAccount;
        this.dateBeginCreditAccount = dateBeginCreditAccount;
        this.dateEndCreditAccount = dateEndCreditAccount;
        this.monthCreditAccount = monthCreditAccount;
        this.creditSumCreditAccount = creditSumCreditAccount;
        this.paymentCreditAccount = paymentCreditAccount;
        this.interestRateCreditAccount = interestRateCreditAccount;
        this.employeeCreditAccount = employeeCreditAccount;
        this.paymentAccountCreditAccount = paymentAccountCreditAccount;

    }
}
