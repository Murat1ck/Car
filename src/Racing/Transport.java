package Racing;




import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static Racing.Validate.validateInteger;
import static Racing.Validate.validateString;


public abstract class Transport {
    private final String brand;
    private final String model;
    private final Set<Sponsor> sponsors;
    private Integer enginePower;
    //private final Set<Driver<?>> drivers;
    //private final Set<Mechanic<?>> mechanics;


    public Transport(String brand,
                     String model,
                     Integer enginePower) {

        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.sponsors = new HashSet<>();
//        this.drivers = drivers;
//        this.mechanics = mechanics;
        this.enginePower = validateInteger(enginePower, 3);

    }

//    public void addDriver(Driver<?> driver) {
//        drivers.add(driver);
//    }

    public void addMechanic(Mechanic<?> mechanic) {

        mechanic.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

//    public Set<Driver<?>> getDrivers() {
//        return drivers;
//    }


    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void refill(String fuel);

    public abstract void start();

    public abstract void finish();

    public abstract boolean diagnostic();

    public abstract void repair();

    public abstract Set<?> mechanics();


    public String mechanicsInfo() {
        List<?> mechanics = new ArrayList<>(mechanics());
        StringBuilder result = new StringBuilder();
        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanics.size(); i++) {
            result.append(mechanics.get(i));
            if (i != mechanics.size() - 1) {
                result.append(", ");
            }


        }
        return result.toString();
    }


    public static int validateYear(Integer value) {
        return value == null || value <= 1900 ? 2000 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }

    public static String validateColor(String value) {
        return validateString(value, "белый");
    }

    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }

    public static String validateCountry(String value) {
        return validateString(value, "RUS");
    }


    public void service() {
    }

    public void offer(Transport transport) {
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        List<Sponsor> sponsorList = new ArrayList<>(sponsors);
        if (!sponsorList.isEmpty()) {
            result.append("Sponsors: ");
        }
        for (int i = 0; i < sponsorList.size(); i++) {
            result.append(sponsorList.get(i));
            if (i != sponsorList.size() - 1) {
                result.append(" , ");
            }
        }
        return result.append("\n").append(mechanicsInfo()).toString();
    }

    public abstract void addDriver(DriverA<PassengerCars> petrov);
}


