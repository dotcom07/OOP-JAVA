public class HW_5_1 {

	public static void main(String[] args) {
		// 음료 이름과 가격을 미리 정의한 배열
		String[] drinkNames = {"Coffee", "Tea", "Juice", "Water", "Soda", "Milk", "Lemonade", "Smoothie", "Iced Tea", "Latte"};
		int[] drinkPrices = {5, 3, 4, 2, 6, 4, 3, 5, 3, 7};
		
		// Drink 객체 배열을 생성 (크기 10)
		Drink[] drinks = new Drink[10];
		
		int Highest=0;
		double Average=0;
  
		for (int i = 0; i< drinks.length; i++) {
		  drinks[i] = new Drink(drinkNames[i], drinkPrices[i]);
  
		  if ( Highest < drinks[i].getPrice() ) {
			  Highest = drinks[i].getPrice();
		  }
  
		}
  
	  Average = (double) Drink.amount/Drink.number_of_drinks;
  
	  System.out.println("Total Order Amount: " + Drink.amount);
	  System.out.println("Total Number of Drinks Ordered: " + Drink.number_of_drinks);
	  System.out.println("Highest Drink Price: " + Highest);
	  System.out.println("Average Drink Price: " + Average);
  
  
	  }
}


class Drink {
    private int drinkPrice;
    private String drinkName;
    static int amount;
    static int number_of_drinks;

    Drink () {}

    public Drink (String drinkName, int drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        amount += drinkPrice;
        number_of_drinks++;
        System.out.println("Drink: " + drinkName + ", Price: " + drinkPrice);
    }

	public int getPrice() {
		return drinkPrice;
	}

	public String getName() {
		return drinkName;
	}

  }
  