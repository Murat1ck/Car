package Racing;

public class DriverB<T extends Bus> extends Driver<T> {
    public DriverB(String name,
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

    public String getMessage(T bus) {
        return "Driver" + getName() + "is driving car" + bus.getBrand() + " " + bus.getModel() +
                "will participate in race";
    }
}

