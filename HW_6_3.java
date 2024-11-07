public class HW_6_3 {

    public static void main(String[] args) {
		WashingMachine wm = new WashingMachine("LG", 1500, 7);
		Microwave mw = new Microwave("Samsung", 1200, 30, 250);
		Refrigerator fridge = new Refrigerator("Whirlpool", 800, 300, 4);
		
		System.out.println(wm);
		wm.operate();
	
		System.out.println(mw);
		mw.plugIn();
		mw.operate();
	
		System.out.println(fridge);
		fridge.plugIn();
		fridge.operate();
  }
}


abstract class Appliance{
	protected String brand;
	protected int power; 
	Appliance(){}
	Appliance(String brand,int power){
		this.brand=brand;
		this.power=power;
	}
	abstract void operate();
}

abstract class KitchenAppliance extends Appliance{

	protected int capacity;
	protected int maxTemperature;

	KitchenAppliance() {}
	KitchenAppliance(String brand,int power,int capacity,int maxTemperature) {
		super(brand, power);
		this.capacity=capacity;
		this.maxTemperature=maxTemperature;
	}
	abstract void operate();
	
	public void plugIn(){
		System.out.println(brand+" kitchen appliance is plugged in.");
	}

}

class WashingMachine extends Appliance{

	protected int drumSize;

	WashingMachine() {}
	WashingMachine(String brand,int power,int drumSize) {
		super(brand, power);
		this.drumSize=drumSize;
	}

	public void operate(){
		System.out.println(brand+" washing machine with "+drumSize+" kg drum is operating.");
	}

	public String toString(){
		return "WashingMachine"+"[brand="+brand+", power="+power+"W, drumSize="+drumSize+"kg]";
	}

}

class Microwave extends KitchenAppliance{

	Microwave(String brand,int power,int capacity,int maxTemperature){
		super(brand, power,capacity,maxTemperature);
	}

	public void operate(){
		System.out.println(brand+" microwave is heating up to "+maxTemperature+"°C.");
	}

	public String toString(){
		return "Microwave"+"[brand="+brand+", power="+power+"W, capacity="+capacity+"L, maxTemperature="+maxTemperature+"°C]";
	}
}

class Refrigerator extends KitchenAppliance{

	Refrigerator(String brand,int power,int capacity,int maxTemperature){
		super(brand, power,capacity,maxTemperature);
	}

	public void operate(){
		System.out.println(brand+" refrigerator is cooling to "+maxTemperature+"°C.");
	}

	public String toString(){
		return "Refrigerator"+"[brand="+brand+", power="+power+"W, capacity="+capacity+"L, temperature="+maxTemperature+"°C]";
	}
}