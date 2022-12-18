package Passport;

import java.util.Set;

public class PassportList {
    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void add(Passport passport) {
        Passport old = get(passport.getNumber());
        if (old == null) {
            old.setName(passport.getName());
            old.setSurName(passport.getSurName());
            old.setPatrName(passport.getPatrName());
            old.setBirthday(passport.getBirthday());
            passports.remove(old);
            passports.add(passport);
        }
    }

    public Passport get(String number) {
        for (Passport passport : passports) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "passports=" + passports +
                '}';
    }
}



