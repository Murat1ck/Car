package Transport;

import static Transport.Bus.validateRefillType;
import static Transport.Validate.validateInteger;
import static Transport.Validate.validateString;

public class Train extends Transport{
    private Integer travelTime;
    private String departure;
    private String destination;
    private Integer wagonCount;

    public Train(String brand,
                 String model,
                 Integer year,
                 String country,
                 String color,
                 Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.travelTime = validateInteger(travelTime, 70);
        this.departure = validateString(departure, "station");
        this.destination = validateString(destination, "station 1");
        this.wagonCount = validateInteger(wagonCount, 17);
    }

    @Override
    void refill(String fuel) {
        System.out.println("the train will be refueled with"+validateRefillType(fuel));
    }

    public static String validateRefillType(String value) {
        if (validateString(value) && value.equals("diesel")) {
            return value;
        }else {
            return "diesel";
        }
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getWagonCount() {
        return wagonCount;
    }

    public void setWagonCount(Integer wagonCount) {
        this.wagonCount = wagonCount;
    }

    @Override
    public String toString() {
        return "Train{" +
                "travelTime=" + travelTime +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", wagonCount=" + wagonCount + '\'' +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
