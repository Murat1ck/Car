package Racing;

import java.util.*;

public class Bus extends Transport implements Competing {
    private DriverC driver;
    private final Set<Mechanic<Bus>> mechanics;

    //    private Capacity capacity;
//    private final Integer pitStopTime;
//    private final Integer maxSpeed;
//    private final Integer bestLapSpeed;
//    private final Set<Mechanic<Bus>> mechanics;
    public Bus(String brand,
               String model,
               Integer enginePower,
               DriverC driver,
               Mechanic<Bus>... mechanics) {
        super(brand, model, enginePower);
        setDriver(driver);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));

    }


    // public Capacity getCapacity() {
    //return capacity;
    // }

    // public void setCapacity(Capacity capacity) {
    // this.capacity = capacity;
    //}


    @Override
    public void refill(String fuel) {

    }

    public void setDriver(DriverC driver) {
        this.driver = driver;
    }

    public DriverC getDriver() {
        return driver;
    }

    @Override
    public void start() {
        System.out.println("Bus started");
    }

    @Override
    public void finish() {
        System.out.println("Bus finished");
    }

    @Override
    public boolean diagnostic() {
        System.out.println("Автобус" + getBrand() + " " + getModel() + "в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Bus" + getBrand() + " " + getModel() + " repair!");
    }

    @Override
    public Set<?> mechanics() {
        return getMechanics();
    }

    @Override
    public void addDriver(DriverA<PassengerCars> petrov) {

    }


    public Set<Mechanic<Bus>> getMechanics() {
        return mechanics;
    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaxSpeed() {

    }
}








