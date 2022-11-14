public class Car {
    String brand;
    String model;
    double engineVolume;


    String color;
    int year;
    String country;


    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";

        }

        this.model = model;
        if (model == null) {
            this.model = "default";

        }
        this.engineVolume = engineVolume;
        if(engineVolume <= 0){
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null) {
            this.color = "white";
        }
        this.year = year;
        this.country = country;
        if (country == null) {
            this.country = "default";

        }

    }

    public void information() {

        System.out.println("brand = " + brand + ", model = " + model + ", engineVolume = " + engineVolume + ", color = " + color + ", year = " + year + ", country = " + country);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

}

