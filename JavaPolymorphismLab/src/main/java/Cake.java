public abstract class Cake {

    private String name;
    private String baseFlavour;
    private double sellPrice;
    private double cost;
    private String frostingFlavour;
    private String toppings;

    public Cake(String name, String baseFlavour, double sellPrice, double cost, String frostingFlavour, String toppings){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.sellPrice = sellPrice;
        this.cost = cost;
        this.frostingFlavour = frostingFlavour;
        this.toppings = toppings;
    }

    // Getter and setter for sellPrice:
    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String selectCakeName(){
        return String.format("You selected %s", this.name);
    }

    public double calculateMargin(){
        return (sellPrice - cost);
    }

}
