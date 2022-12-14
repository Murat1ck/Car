package Racing;


import static Racing.Validate.validateInteger;
import static Transport.Transport1.validateCarParameters;
//import static Validate.validateInteger;

public abstract class Transport {
    private final String brand;
    private final String model;
    private Integer enginePower;

    public Transport(String brand,
                     String model,
                     Integer enginePower) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.enginePower = validateInteger(enginePower,3);
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

    public abstract void refill(String fuel);

    public abstract void start();
    public abstract void finish();

    public abstract boolean diagnostic();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}


