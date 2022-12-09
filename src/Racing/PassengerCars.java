package Racing;

public class PassengerCars extends Transport implements Competing {

    private TypeOfBody typeOfBody;
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapSpeed;

    public PassengerCars(String brand,
                         String model,
                         Integer enginePower,
                         TypeOfBody typeOfBody,
                         Integer pitStopTime,
                         Integer maxSpeed) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapSpeed = bestLapSpeed;
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }
    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }



    @Override
    public void refill(String fuel) {

    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void finish() {
        System.out.println("Car finished");
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
        System.out.println("Car max speed" + maxSpeed);
    }
}
