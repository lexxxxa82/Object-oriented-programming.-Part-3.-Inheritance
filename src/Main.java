import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Shortage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avant", 1.6, "оранжевый", 2016, "Южная Корея");


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


        Bus daewoo = new Bus("DAEWOO", "Пассажисркий", 2010, "Южная корея", "белый", 180);
        Bus kamaz = new Bus("Камаз", "Пассажисркий", 2020, "Россия", "зеленый", 160);
        Bus mercedes= new Bus("MERCEDES ", "Пассажисркий", 2018, "Германия", "серый", 180);
        System.out.println(daewoo);
        System.out.println(kamaz);
        System.out.println(mercedes);
    }

}