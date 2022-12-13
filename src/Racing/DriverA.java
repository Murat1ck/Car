package Racing;

public class DriverA<T extends PassengerCars> extends Driver<T> {
    public DriverA(String name,
                   boolean license,
                   Integer experience) {
        super(name,license,experience);
    }

    @Override
    public String start() {
        return "Car Started";
    }

    @Override
    public String stop() {
        return "Car Stoped";
    }

    @Override
    public String refuel() {
        return "charging with petrol";
    }

    public String getMessage(T passengerCars) {
        return "Driver" + getName() + "is driving car" + passengerCars.getBrand() + " " + passengerCars.getModel() +
                "will participate in race";
    }
}
