package Racing;

public class Trucks extends Transport implements Competing{
    private WeightType weightType;
    private  final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapSpeed;

    public Trucks(String brand,
               String model,
               Integer enginePower,
                  WeightType weightType,
               Integer pitStopTime,
               Integer maxSpeed,
               Integer bestLapSpeed) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapSpeed = bestLapSpeed;
        this.weightType = weightType;
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
