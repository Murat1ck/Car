package Racing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Trucks extends Transport implements Competing{
    private WeightType weightType;
    private  final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapSpeed;
    private final Set<Mechanic<Trucks>> mechanics;

    public Set<Mechanic<Trucks>> getMechanics() {
        return mechanics;
    }

    public Trucks(String brand,
                  String model,
                  Integer enginePower,
                  WeightType weightType,
                  Integer pitStopTime,
                  Integer maxSpeed,
                  Integer bestLapSpeed,
                  Mechanic<Trucks>...mechanics   ) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapSpeed = bestLapSpeed;
        this.weightType = weightType;
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
    }

    public WeightType getWeightType() {
        return weightType;
    }

    public void setWeightType(WeightType weightType) {
        this.weightType = weightType;
    }

    @Override
    public void refill(String fuel) {

    }

    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void finish() {
        System.out.println("Truck finished");
    }

    @Override
    public boolean diagnostic() {

        return false;
    }

    @Override
    public void repair() {
        System.out.println("Truck" + getBrand() + " " + getModel() + " repair!");

    }

    @Override
    public Set<?> mechanics() {
        return getMechanics();
    }

    @Override
    public void addDriver(DriverA<PassengerCars> petrov) {

    }

    @Override
    public void getPitStop() {
        System.out.println("Pit-stop" + pitStopTime);

    }

    @Override
    public void getBestLapTime() {
        System.out.println("best lap" + bestLapSpeed);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Truck max speed" + maxSpeed);
    }
}
