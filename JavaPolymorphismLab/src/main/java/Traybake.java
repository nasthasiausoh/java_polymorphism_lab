public class Traybake extends Cake {


    private int traybakeSize;
    private int numberOfSlices;

    public Traybake(String name, String baseFlavour, double sellPrice, double cost, String frostingFlavour, String toppings, int traybakeSize, int numberOfSlices) {
        super(name, baseFlavour, sellPrice, cost, frostingFlavour, toppings);
        this.traybakeSize = traybakeSize;
        this.numberOfSlices = numberOfSlices;
    }

    // getter and setter for traybakeSize

    public int getTraybakeSize() {
        return traybakeSize;
    }

    public void setTraybakeSize(int traybakeSize) {
        this.traybakeSize = traybakeSize;
    }


    // getter and setter for numberOfSlices
    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }
}
