package assessing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class App {
    public static void printAllPrintableObjects(IPrint[]printAbles){
for(int i = 0; i< printAbles.length; i++){
    System.out.println(i);
}
    }
    public static void consumeConsumables(Consumable[]consumables){
for(int i = 0; i< consumables.length; i++){
    System.out.println(i);
}
    }
    public static String getTotalPriceOfCustomer(Customer customer){
      //  for(int i = 0; i< products.length; i++)
        return "Total price is";
    }
    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product>products){
        products.sort(Comparator.comparingDouble(Product::getPrice));
        products.forEach(System.out::println);

    }
    public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product>products,Product product){
        return null;
    }
    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String,Product> yes, Customer customer, Product product){

    }
}

