/**
 * Created by Raihan Sabique on 9/18/2015.
 */
public class TestCar {
    public static void main(String[] args) {
        Driver lewis=new Driver("Lewis Hamilton", 30, "UK");
        System.out.printf("Name:" + lewis.getName() + "\nAge:" + lewis.getAge() + "\nCountry:" + lewis.getCountry() + "\n");

        Driver vettel=new Driver("Sebastian Vettel",28);
        vettel.setCountry("Germany");
        vettel.print();

        Car c1=new Car("F1 W06", "Mercedes", lewis, 500);
        System.out.printf("Care Name:"+c1.getName()+"\nManufacturer:"+c1.getManufacturer()+"\nDriver:"+c1.getDriver().getName()+"\nFuelCapacity:"+c1.getFuelCapacity()+"\n");
        c1.refuel(100);
        c1.drive(400);
        System.out.printf("Care Name:" + c1.getName() + "\nManufacturer:" + c1.getManufacturer() + "\nDriver:" + c1.getDriver().getName() + "\nFuelCapacity:" + c1.getFuelCapacity() + "\n");

        Car c2=new Car("SE15-T","Ferrari");
        c2.setDriver(vettel);
        c2.setFuelCapacity(400);
        c2.print();
        c2.refuel(50);
        c2.drive(500);
        c2.print();

        c1.getDriver().print();
        c2.getDriver().print();

    }
}
