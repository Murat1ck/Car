package Transport;

import java.security.Key;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean typeOfRubber;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume,
               String color, int year, String country, String transmission,
               String bodyType, String regNumber, int numberOfSeats,
               boolean typeOfRubber, Key key,Insurance insurance) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }
        this.year = year;
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        this.country = country;
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (bodyType == null) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;

    }

    public Car(String brand, String model,
               double engineVolume, String color, int year, String country) {
        this(
                brand, model, engineVolume, color, year, country,
                "МКПП", "Седан", "x000xx000", 5,
                true, new Key(),new Insurance());

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        this.regNumber = regNumber;
    }

    public boolean isTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTypeOfRubber() {
        typeOfRubber = !typeOfRubber;

    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char chars[] = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean keyAccess;

        public Key(boolean remoteRunEngine, boolean keyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keyAccess = keyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isKeyAccess() {
            return keyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;


        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
        }




        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }


        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно оформить новую страховку");
            }
        }

        public void checkNumber(){
            if (number.length() != 9) {
                System.out.println("Номер страховки не коректный");
            }
        }
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
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", typeOfRubber=" + typeOfRubber +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }
}



