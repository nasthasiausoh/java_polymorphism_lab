import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bakery {
    Cupcake cupcake;
    Cake cake;

    private String name;
    private ArrayList<Cake> cakes;
    private double till;


    public Bakery(String name) {
        this.name = name;
        this.cakes = new ArrayList<>();
        this.till = 0;
    }

    // Getters and setter for name:
    public String getName() {
        return name;
    }


    // Getters and setter for till:
    public double getTill() {
        return till;
    }

    // Method for counting cakes in arraylist
    public int countCakes() {
        return this.cakes.size();

    }

    // Method for adding cakes to arraylist
    public void addCake(Cake cake) {
        this.cakes.add(cake);
    }
}






