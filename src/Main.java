import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, 2015, "Россия" ,"желтый", 180, "механика"," седан","у306хн38", 5,true, new Car.Key());
        Car audi = new Car("Audi", "A8 50 L TDI quattro",2.5, 2020, "Германия", "черный",180, "механика"," седан","у306хн38", 5,true,new Car.Key());
        Car bmw = new Car("BMW", "Z8", 3,2021, "Германия", "черный", 180, "механика"," седан","у306хн38", 5,true,new Car.Key());
        Car kia = new Car("Kia", "Shortage 4-го поколения", 2.4, 2018, "Южная Корея", "красный", 180, "механика"," седан","у306хн38", 5,true,new Car.Key());
        Car hyundai = new Car("Hyundai", "Avant", 1.6, 2016, "Южная Корея", "оранжевый", 180, "механика"," седан","у306хн38", 5,true, new Car.Key());


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


        Bus daewoo = new Bus("DAEWOO", "Пассажисркий", 2010, "Южная корея", "белый", 180);
        Bus kamaz = new Bus("Камаз", "Пассажисркий", 2020, "Россия", "зеленый", 160);
        Bus mercedes = new Bus("MERCEDES ", "Пассажисркий", 2018, "Германия", "серый", 180);
        System.out.println(daewoo);
        System.out.println(kamaz);
        System.out.println(mercedes);
    }

}