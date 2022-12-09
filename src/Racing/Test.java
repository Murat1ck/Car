package Racing;

public class Test {
    public static void main(String[] args) {
        PassengerCars bmw = new PassengerCars("bmw", "f30", 2,
                30, 2015, 300);

        System.out.println(bmw);
        DriverA<PassengerCars> driverA = new DriverA<>("Petrov",true,17);
        System.out.println(driverA.getMessage(bmw));



    }
}
