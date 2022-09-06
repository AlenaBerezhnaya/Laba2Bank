package tech.reliab.course.berezhnayaa.bank.entity;

import java.util.Date;

public class BankAtm {

    public int idBankAtm; // Id банкомата
    public String nameBankAtm;  // Имя банкомата
    public String addressBankAtm;  // Адрес (сопадает с адресом банковского офиса)
    // public Date statusBankAtm;  // Статус (работает/не работает/нет денег)
    public Bank bankBankAtm;  // Банк, которому принадлежит банкомат
    public String locationBankAtm;  // Расположение банкомата (банкомат может быть расположен только в банковском офисе)
    public String employeeBankAtm;  // Обслуживающий сотрудник
    public boolean cashBankAtm;  // Работает ли на выдачу денег? (да/нет)
    public boolean contributeBankAtm;  // Можно ли внести деньги? (да/нет)
    public int allMoneyBankAtm;  // Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке)
    public int priceBankAtm;  // Стоимость обслуживания банкомата

    public BankAtm(int idBankAtm, String nameBankAtm, String addressBankAtm, Bank bankBankAtm, String locationBankAtm, String employeeBankAtm, boolean cashBankAtm, boolean contributeBankAtm, int allMoneyBankAtm, int priceBankAtm) {
        this.idBankAtm = idBankAtm;
        this.nameBankAtm = nameBankAtm;
        this.addressBankAtm = addressBankAtm;
        this.bankBankAtm = bankBankAtm;
        this.locationBankAtm = locationBankAtm;
        this.employeeBankAtm = employeeBankAtm;
        this.cashBankAtm = cashBankAtm;
        this.contributeBankAtm = contributeBankAtm;
        this.allMoneyBankAtm = allMoneyBankAtm;
        this.priceBankAtm = priceBankAtm;
    }
}
