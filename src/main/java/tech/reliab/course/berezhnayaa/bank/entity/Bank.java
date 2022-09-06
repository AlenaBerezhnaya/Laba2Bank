package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Data;
@Data
public class Bank {

    public int idBank; // Id банка
    public String nameBank;  // Имя банка
    public int numberOffices;  // Кол-во офисов (заполняется и считается автоматически при добавлении нового офиса), по умолчанию 0
    public int numberBankAtm;  // Кол-во банкоматов (заполняется и считается автоматически при добавлении нового банкомата), по умолчанию 0
    public int numberEmployee;  // Кол-во сотрудников (заполняется и считается автоматически при добавлении нового сотрудника), по умолчанию 0
    public int numberBankAtmOffice;  // Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка)
    public boolean numberUser;  // Кол-во клиентов (заполняется и считается автоматически при добавлении нового клиента в банк), по умолчанию 0
    public boolean ratingBank;  // Рейтинг банка (генерируется рандомно, от 0 до 100, где 100 наивысший балл, чем выше рейтинг банка, тем меньше должна быть процентная ставка)
    public boolean allMoneyBank;  // Всего денег в банке (генерируется рандомно, но не более 1 000 000)
    public int interestRateBank;  // Процентная ставка (генерируется рандомно, но не более 20%, однако нужно учитывать рейтинг банка, чем он выше, тем ставка должна сгенерироваться меньше)

}