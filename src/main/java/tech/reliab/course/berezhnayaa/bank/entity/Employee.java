package tech.reliab.course.berezhnayaa.bank.entity;

import java.util.Date;

public class Employee {

    public int idEmployee; // Id сотрудника
    public String fioEmployee;  // ФИО
    public Date dateOfBirthEmployee;  // Дата рождения
    public String jobTitleEmployee;  // Должность
    public String bankEmployee;  // В каком банке работает
    public boolean optionEmployee;  // Работает ли в банковском офисе или удаленно? (да/нет)
    public String officeEmployee;  // Банковский офис, в котором работает
    public boolean creditEmployee;  // Может ли выдавать кредиты? (да/нет)
    public int salaryEmployee;  // Размер зарплаты

    public Employee(int idEmployee, String fioEmployee, Date dateOfBirthEmployee, String jobTitleEmployee, String bankEmployee, boolean optionEmployee, String officeEmployee, boolean creditEmployee, int salaryEmployee) {
        this.idEmployee = idEmployee;
        this.fioEmployee = fioEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.jobTitleEmployee = jobTitleEmployee;
        this.bankEmployee = bankEmployee;
        this.optionEmployee = optionEmployee;
        this.officeEmployee = officeEmployee;
        this.creditEmployee = creditEmployee;
        this.salaryEmployee = salaryEmployee;

    }
}
