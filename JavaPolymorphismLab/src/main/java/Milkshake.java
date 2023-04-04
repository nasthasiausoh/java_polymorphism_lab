import interfaces.ISell;

public class Milkshake implements ISell {

        private String name;
        private String flavour;
        private double sellPrice;

        public Milkshake(String name, String flavour, double sellPrice){
            this.name = name;
            this.flavour = flavour;
            this.sellPrice = sellPrice;
        }
        public String getDisplayName(){
            return String.format("%s - %s - £%s" , this.name.toUpperCase(), this.flavour.toUpperCase(), this.sellPrice);
        }
}
