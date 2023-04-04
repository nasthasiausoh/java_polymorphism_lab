public class Cupcake extends Cake {

    Cupcake cupcake;

    private boolean sprinkles;

    public Cupcake(String name, String baseFlavour, double sellPrice, double cost, String frostingFlavour, String toppings, boolean sprinkles) {
        super(name, baseFlavour, sellPrice, cost, frostingFlavour, toppings);
        this.sprinkles = sprinkles;
    }

    // getters and setters for sprinkles:

    public boolean getSprinkles() {
        return sprinkles;
    }

    public void setSprinkles(boolean sprinkles) {
        this.sprinkles = sprinkles;
    }

    public String addSprinkles(){
        return "Add sprinkles";
    }

    public String orderMessage(){
        return "You have ordered" + name;
    }





}


