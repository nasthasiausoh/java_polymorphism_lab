public class TieredCake extends Cake {

    private int tiers;

    public TieredCake(String name, String baseFlavour, double sellPrice, double cost, String frostingFlavour, String toppings, int tiers) {
        super(name, baseFlavour, sellPrice, cost, frostingFlavour, toppings);
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}