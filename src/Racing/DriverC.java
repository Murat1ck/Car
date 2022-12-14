package Racing;
public class DriverC<T extends Trucks> extends Driver<T> {
    public DriverC(String name,
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
        return "Car Stopped";
    }

    @Override
    public String refuel() {
        return "charging with petrol";
    }

    public String getMessage(T trucks) {
        return "Driver" + getName() + "is driving car" + trucks.getBrand() + " " + trucks.getModel() +
                "will participate in race";
    }
}
