//Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
//Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
//BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
//Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
//Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","Granta",1.7,"Жёлтый",2015,"Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"Black",2020,"Germany");
        Car bmw = new Car("BMW","Z8",3.0,"Black",2021,"Germany");
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4,"Red",2018,"Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6,"Orange",2016,"Южная Корея");



        lada.information();
        audi.information();
        bmw.information();
        kia.information();
        hyundai.information();



    }
}