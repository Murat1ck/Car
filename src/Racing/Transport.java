package Racing;


import java.util.ArrayList;
import java.util.List;

import static Racing.Validate.validateInteger;
import static Transport.Transport1.validateCarParameters;
//import static Validate.validateInteger;

public abstract class Transport {
    private final String brand;
    private final String model;

    private Integer enginePower;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand,
                     String model,
                     Integer enginePower) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.enginePower = validateInteger(enginePower,3);
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void refill(String fuel);

    public abstract void start();
    public abstract void finish();

    public abstract boolean diagnostic();
    public abstract void repair();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}


