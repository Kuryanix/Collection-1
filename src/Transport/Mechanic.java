package Transport;

public class Mechanic <C extends Car> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean diagnostic(C c) {
        return c.diagnostic();
    }

    public void repair(C c) {
        c.repair();
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
