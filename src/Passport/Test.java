package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("1234",
                "Иванов", "Иван",
                "Иванович", LocalDate.now().minusYears(25)));
        passports.add(new Passport("1234",
                "Petrov", "Petr",
                "Petrovich", LocalDate.now().minusYears(40)));
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);

    }
}
//HashSet заботает быстрее,т.к он обрабатывает по хешкоду
