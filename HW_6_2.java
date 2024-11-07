public class HW_6_2 {

    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", "Golden Retriever");
        Animal myCat = new Cat("Whiskers", 3);
        Animal myBird = new Bird("Tweety", "Yellow");
        Animal myFish = new Fish("Nemo", "Saltwater");
    
        Animal[] animals = { myDog, myCat, myBird, myFish };
    
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.sound();
      }
  }
}


class Animal{

    private String name;

	Animal() {}

	public String getName() {
        return name;
    }

	Animal(String name){
		this.name = name;
	}

	public void sound(){
	}

}

class Dog extends Animal{

	private String breed;
	Dog() {}

	Dog(String name,String breed){
		super(name);
		this.breed = breed;
	}

	public String toString(){
		return "Dog[name=" + getName() +", breed=" + breed +"]" ;
	}

	public void sound(){
		System.out.println(getName()+" barks.");
	}

}



class Cat extends Animal{

	private int age;

	Cat() {}

	Cat(String name,int age){
		super(name);
		this.age = age;
	}

	public String toString(){
		return "Cat[name=" + getName() +", age=" + age +"]" ;
	}

	public void sound(){
		System.out.println(getName()+" meows.");
	}

}


class Bird extends Animal{

	private String color;

	Bird() {}

	Bird(String name,String color){
		super(name);
		this.color =color;
	}

	public String toString(){
		return "Bird[name=" + getName() +", color=" + color +"]" ;
	}

	public void sound(){
		System.out.println(getName()+" chirps.");
	}

}


class Fish extends Animal{

	private String waterType;

	Fish() {}

	Fish(String name,String waterType){
		super(name);
		this.waterType = waterType;
	}

	public String toString(){
		return "Fish[name=" + getName() +", waterType=" + waterType +"]" ;
	}

	public void sound(){
		System.out.println(getName()+" does not make a sound.");
	}

}

