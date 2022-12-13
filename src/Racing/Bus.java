package Racing;

public class Bus extends Transport implements Competing{
    private  final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapSpeed;

    public Bus(String brand,
               String model,
               Integer enginePower,
               Integer pitStopTime,
               Integer maxSpeed,
               Integer bestLapSpeed) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapSpeed = bestLapSpeed;
    }

    @Override
    public void refill(String fuel) {

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
        System.out.println("Автобус" +getBrand()+" " + getModel() + "в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Bus" + getBrand() + " " + getModel() + " repair!");
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
        System.out.println("Bus max speed" + maxSpeed);
    }

}








