/**
 * Created by Raihan Sabique on 9/17/2015.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;

    public Car(String name, String manufacturer, Driver driver, int fuelCapacity){
        this.name=name;
        this.manufacturer=manufacturer;
        this.driver=driver;
        this.fuelCapacity=fuelCapacity;
    }

    public Car(String name, String manufacturer){
        this.name=name;
        this.manufacturer=manufacturer;
    }
    public String getName(){
        return name;
    }
    public void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity=fuelCapacity;

    }
    public void setDriver(Driver driver){
        this.driver=driver;
    }
    public Driver getDriver(){
        return driver;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getFuelCapacity(){
        return fuelCapacity;
    }
    public void refuel(int add){
        fuelCapacity+=add;
    }
    public void drive(int km){
        if(fuelCapacity>=km){
            fuelCapacity-=km;
        }
        else {
            System.out.println("Driving distance exceeds the car's fuel capacity!");
        }
    }
    public void print(){
        System.out.printf("name:"+name+"\nManufacturer:"+manufacturer+"\nDriver:"+driver.getName()+"\nFuelCapacity:"+fuelCapacity+"\n");
    }
}
