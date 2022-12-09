import Transport.Car;
import Transport.Train;

//Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
//Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
//BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
//Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
//Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", "f30", 2.0, "black", 2015, "Germany", "auto",
                "sedan", " ", 5, true, 230, "petrol");

        System.out.println(bmw);




        }


    }
