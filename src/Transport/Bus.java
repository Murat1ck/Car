package Transport;

import static Transport.Validate.validateString;

public class Bus extends Transport{
    public Bus(String brand,
               String model,
               Integer year,
               String country,
               String color,
               Integer maxSpeed){
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    void refill(String fuel) {
        System.out.println("the bus will be refueled with"+validateRefillType(fuel));}

    public static String validateRefillType(String value) {
        if(validateString(value) && value.equals("diesel") || value.equals("petrol")) {
            return value;
        }else {
            return "diesel";
        }
    }
}
