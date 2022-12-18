package Racing;

import java.util.Objects;

public class Mechanic<T extends Transport> {
    private String name;
    private String surName;
    private String company;

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    public boolean diagnostic(T t) {
        return t.diagnostic();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surName, mechanic.surName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, company);
    }

    public void add(Mechanic<?> mechanic) {
    }
}
