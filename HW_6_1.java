public class HW_6_1 {

	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle("Generic Vehicle", 100);
		Car myCar = new Car("Sedan", 120);
		Truck myTruck = new Truck("Freightliner", 80, 10);
		SportsCar mySportsCar = new SportsCar("Ferrari", 200);
		ElectricTruck myElectricTruck = new ElectricTruck("Tesla Semi", 90, 8, 500);
  
		System.out.println(myVehicle);
		myVehicle.drive();
  
		System.out.println(myCar);
		myCar.drive();
		myCar.honk();
  
		System.out.println(myTruck);
		myTruck.drive();
		myTruck.loadCargo();
  
		System.out.println(mySportsCar);
		mySportsCar.drive();
		mySportsCar.honk();
		mySportsCar.turboBoost();
  
		System.out.println(myElectricTruck);
		myElectricTruck.drive();
		myElectricTruck.loadCargo();
		myElectricTruck.chargeBattery();
  }
}



class Vehicle {

    String name;
    int speed;

    public Vehicle() {}

    public Vehicle(String name,int speed) {
        this.name =  name;
        this.speed =  speed;
    }

    public String getname() {
        return this.name;
    }

    public int getspeed() {
        return this.speed;
    }

    public void setname(String name) {
        this.name = name ;
    }

    public void setspeed(int speed) {
        this.speed=speed;
    }

    public void drive() {
        System.out.println("Generic Vehicle is driving at "+speed+" km/h.");
    }

    public String toString() {
        return "Vehicle[Model: "+name+", Speed: "+speed+" km/h]";
    }

}

class Car extends Vehicle {


    public Car(String name, int speed) {
        super(name, speed);    
    }

    public void drive() {
        System.out.println(name+" is cruising smoothly at "+speed+" km/h.");
    }
    
    public void honk() {
        System.out.println(name+" is honking.");
    }

    public String toString() {
        return "Car[Model: "+name+", Speed: "+speed+" km/h]";
    }

}


class Truck extends Vehicle {

    int cargo;  

    public Truck(String name, int speed,int cargo) {
        super(name, speed);
        this.cargo = cargo;
    }

    public void drive() {
        System.out.println(name+" is driving steadily at "+speed+" km/h with a heavy load.");
    }
    
    public void honk() {
        System.out.println(name+" is honking.");
    }

    public void loadCargo(){
        System.out.println(name+" is loading cargo. Capacity: "+cargo+" tons.");
    }

    public String toString() {
        return "Truck[Model: "+name+", Speed: "+speed+" km/h, Load Capacity: "+cargo+" tons]";
    }
    
}


class SportsCar extends Car{

    public SportsCar(String name, int speed) {
        super(name, speed);
    }

    public void honk() {
        System.out.println(name+" is honking with a sporty sound!");
    }

    public void turboBoost(){
        System.out.println(name+" is using turbo boost!");
    }

    public String toString() {
        return "SportsCar[Model: "+name+", Speed: "+speed+" km/h]";
    }

}


class ElectricTruck extends Truck {

    int Battery;

    public ElectricTruck(String name, int speed,int cargo,int Battery) {
        super(name, speed,cargo);
        this.Battery = Battery;
    }

    public void drive() {
        System.out.println(name+" is driving steadily at "+speed+" km/h with a heavy load.");
    }
    
    public void honk() {
        System.out.println(name+" is honking.");
    }

    public void loadCargo(){
        System.out.println(name+" is loading electric cargo with extra efficiency. Capacity: "+cargo+" tons.");
    }
    
    public void chargeBattery(){
        System.out.println(name+" is charging its battery. Capacity: "+Battery+" kWh.");
    }

    public String toString() {
        return "ElectricTruck[Model: "+name+", Speed: "+speed+" km/h, Load Capacity: "+cargo+" tons, Battery Capacity: "+Battery+" kWh]";
    }
}

