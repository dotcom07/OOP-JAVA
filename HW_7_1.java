public class HW_7_1 {

	public static void main(String[] args) {

        // Snack, Beverage, Furniture, Appliance, Tool
        Item131[] items = new Item131[5];
        items[0] = new Snack131("chip001", 200, "spicy"); // id, calories, flavor
        items[1] = new Beverage131("soda123", 150, 500); // id, calories, volume
        items[2] = new Furniture131("chair45", "wood", 10); // id, material, weight
        items[3] = new Appliance131("toaster900", "metal", 1500);  // id, material, power
        items[4] = new Tool131("drill77", "plastic", true);  // id, material, isElectric

        System.out.println("------- show info -------");
        showInfo(items);
        System.out.println();

        System.out.println("------- show consumable items -------");
        showConsumableItems(items);
        System.out.println();

        System.out.println("------- show non-consumable items -------");
        showNonConsumableItems(items);
        System.out.println();

        System.out.println("------- show portable items -------");
        showPortableItems(items);
        System.out.println();

        System.out.println("------- show perishable items -------");
        showPerishableItems(items);
    }

    public static void showInfo(Item131[] items) {
       for (int i = 0; i< items.length; i++){
        System.out.println(items[i]);
       }
    }

    public static void showConsumableItems(Item131[] items) {
        for (int i = 0; i< items.length; i++){
            if(items[i] instanceof Consumable131){
                System.out.println(items[i]);
            }
           }
    }

    public static void showNonConsumableItems(Item131[] items) {
        for (int i = 0; i< items.length; i++){
            if(items[i] instanceof NonConsumable131){
                System.out.println(items[i]);
            }
    }
}

    public static void showPortableItems(Item131[] items) {
        for (int i = 0; i< items.length; i++){
            if(items[i] instanceof Portable131){
                System.out.println(items[i]);
            }
    }
}

    public static void showPerishableItems(Item131[] items) {
        for (int i = 0; i< items.length; i++){
            if(items[i] instanceof Perishable131){
                System.out.println(items[i]);
            }
    }
}
}


class Item131 {
    protected String id;
    
    Item131() {}

    Item131(String id) {
        this.id = id;
    }
    
    public String toString(){
        return "[ITEM] id"+"("+id+")";
    }

}

class Consumable131 extends Item131 {
    protected int calories;

    Consumable131() {}
    Consumable131(String id, int calories){
        super(id);
        this.calories = calories;
    }

    public String toString(){
        String re = super.toString();
        re += " [CONSUMABLE] calories("+this.calories+")";
            return re;
        }

    }



    interface Perishable131 { 
        public abstract boolean isExpired(); 
    }
    
    interface Refillable131 { 
        public abstract boolean needsRefill(); 
    }
    
    interface Portable131 { 
        public abstract boolean isPortable(); 
    }
    

class NonConsumable131 extends Item131 {
        protected String material;
    
        NonConsumable131() {}
        NonConsumable131(String id, String material){
            super(id);
            this.material= material;
        }
    
        public String toString(){
            String re = super.toString();
            re += " [NON_CONSUMABLE] material(" + material +")";
                return re;
            }
    }

class Snack131 extends Consumable131 implements Perishable131{
    protected String flavor;

    Snack131(String id, int calories, String flavor){
        super(id,calories);
        this.flavor = flavor;
    }


    public boolean isExpired(){
        return false;
    }

    public String toString(){
        String re = super.toString();
        re += " [SNACK] flavor("+this.flavor+")"+" isExpired("+this.isExpired()+")";
            return re;
        }

}


class Beverage131 extends Consumable131 implements Refillable131{
    protected int volume;

    Beverage131(String id, int calories, int volume){
        super(id,calories);
        this.volume = volume;
    }

    public boolean needsRefill(){
        return true;
    }

    public String toString(){
        String re = super.toString();
        re += " [BEVERAGE] volume("+this.volume+"ml" + ")" + " needsRefill("+this.needsRefill()+ ")";
            return re;
        }

}

class Furniture131 extends NonConsumable131 implements Portable131{
    protected int weight;

    Furniture131(String id, String material, int weight){
        super(id,material);
        this.weight = weight;
    }

    public boolean isPortable(){
        return true;
    }

    public String toString(){
        String re = super.toString();
        re += " [FURNITURE] weight("+this.weight+"kg)"+ " isPortable("+this.isPortable()+")";
            return re;
        }

}



class  Appliance131 extends NonConsumable131 {
    protected int power;

    Appliance131(String id, String material, int power){
        super(id,material);
        this.power = power;
    }

    public boolean needsRefill(){
        return true;
    }

    public String toString(){
        String re = super.toString();
        re += " [APPLIANCE] power("+this.power+"W)";
            return re;
        }

}


class Tool131 extends NonConsumable131 implements Portable131{
    protected boolean isElectric;

    Tool131(String id, String material, boolean isElectric){
        super(id,material);
        this.isElectric = isElectric;
    }

    public boolean isPortable(){
        return false;
    }

    public String toString(){
        String re = super.toString();
        re += " [TOOL] isElectric("+this.isElectric+ ")"+ " isPortable("+this.isPortable()+")";
            return re;
        }

}

