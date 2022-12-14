package Transport;

import Racing.Transport;

import static Racing.Validate.validateString;

//import static Validate.validateString;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               Integer year,
               String country,
               String color,
               Integer maxSpeed){
        super(brand, model, maxSpeed);
    }

    @Override
    public void refill(String fuel) {
        System.out.println("the bus will be refueled with"+validateRefillType(fuel));}

    public static String validateRefillType(String value) {
        if(validateString(value) && value.equals("diesel") || value.equals("petrol")) {
            return value;
        }else {
            return "diesel";
        }
    }

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }
}
