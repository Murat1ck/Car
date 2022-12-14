package Racing;

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
}
