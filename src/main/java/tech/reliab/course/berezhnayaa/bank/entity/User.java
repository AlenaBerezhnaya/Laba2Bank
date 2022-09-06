package tech.reliab.course.berezhnayaa.bank.entity;

import java.util.Date;

public class User {

    public int idUser; // Id клиента
    public String fioUser;  // ФИО
    public Date dateOfBirthUser;  // Дата рождения
    public String placeOfWorkUser;  // Место работы
    public int incomeUser;  // Ежемесячный доход
    public String usedBanksUser;  // Банки, которыми он пользуется
    public int creditAccountUser;  // Кредитные счета
    public int paymentAccountUser;  // Платежные счета
    public int bankCreditRatingUser;  // Кредитный рейтинг для банка

    public User(int idUser, String fioUser, Date dateOfBirthUser, String placeOfWorkUser, int incomeUser, String usedBanksUser, int creditAccountUser, int paymentAccountUser, int bankCreditRatingUser) {
        this.idUser = idUser;
        this.fioUser = fioUser;
        this.dateOfBirthUser = dateOfBirthUser;
        this.placeOfWorkUser = placeOfWorkUser;
        this.incomeUser = incomeUser;
        this.usedBanksUser = usedBanksUser;
        this.creditAccountUser = creditAccountUser;
        this.paymentAccountUser = paymentAccountUser;
        this.bankCreditRatingUser = bankCreditRatingUser;

    }
}