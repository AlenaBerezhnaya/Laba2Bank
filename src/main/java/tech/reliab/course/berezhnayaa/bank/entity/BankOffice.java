package tech.reliab.course.berezhnayaa.bank.entity;

import java.util.Date;

public class BankOffice {

    public int idBankOffice; // Id банковского офиса
    public String nameBankOffice;  // Название офиса
    public String addressBankOffice;  // Адрес банковского офиса
    public Date statusBankOffice;  // Статус (работает/не работает)
    public Date bankBankAtmOffice;  // Можно ли разместить банкомат? (да/нет)
    public int numberBankAtmOffice;  // Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка)
    public boolean creditBankOffice;  // Можно ли оформить кредит в данном офисе? (да/нет)
    public boolean cashBankOffice;  // Работает ли на выдачу денег? (да/нет)
    public boolean contributeBankOffice;  // Можно ли внести деньги? (да/нет)
    public int allMoneyBankOffice;  // Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег в банке)
    public int priceOfficeBankOffice;  // Стоимость аренды банковского офиса

    public BankOffice(int idBankOffice, String nameBankOffice, String addressBankOffice, Date statusBankOffice, Date bankBankAtmOffice, int numberBankAtmOffice, boolean creditBankOffice, boolean cashBankOffice, boolean contributeBankOffice, int allMoneyBankOffice, int priceOfficeBankOffice) {
        this.idBankOffice = idBankOffice;
        this.nameBankOffice = nameBankOffice;
        this.addressBankOffice = addressBankOffice;
        this.statusBankOffice = statusBankOffice;
        this.bankBankAtmOffice = bankBankAtmOffice;
        this.numberBankAtmOffice = numberBankAtmOffice;
        this.creditBankOffice = creditBankOffice;
        this.cashBankOffice = cashBankOffice;
        this.contributeBankOffice = contributeBankOffice;
        this.allMoneyBankOffice = allMoneyBankOffice;
        this.priceOfficeBankOffice = priceOfficeBankOffice;

    }
}
