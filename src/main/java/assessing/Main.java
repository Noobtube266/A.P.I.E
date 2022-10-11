package assessing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream("Vanilla",12.0,Size.L);
        Battery battery = new Battery("Triple A",20.0,Size.S);
        PostalStamp postalStamp = new PostalStamp("Stamp Americano",5,Size.X);
        Product [] products ={iceCream, battery, postalStamp};

        ArrayList<String> addresses = new ArrayList<>();

        Admin admin = new Admin("BootyShaker9000","2221212");

        Customer customer1 = new Customer("SuperSteve", "SteveSuper25", 0, -150.0, addresses,Size.M,products);
        Customer customer2 = new Customer("JuicyBoy","5652104",400,100.0,addresses,Size.X,products);
        Customer customer3 = new Customer("PikachuHugger","4758ironic",200,500.0,addresses,Size.S,products);

        App.reverseSortAndPrintAllProductsByPrice(products);
    }
}
