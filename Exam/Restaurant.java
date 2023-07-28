// importing java util package
import java.util.*;
// using hash maps to store key value pairs of the menu items and prices
public class Restaurant {
     private Map<String, Double> menu;
    private Map<String, Integer> ratings;
// constructor for the class
    public Restaurant() {
        menu = new HashMap<>();
        ratings = new HashMap<>();
    }
    // generating getters and setters
    public Map<String, Double> getMenu() {
        return menu;
    }
    public Map<String, Integer> getRatings() {
        return ratings;
    }

    // generating setters
    public void setMenu(Map<String, Double> menu) {
        this.menu = menu;
    }
    public void setRatings(Map<String, Integer> ratings) {
        this.ratings = ratings;
    }
    // methods 
    // to add items
    public void addItem(String item, double price) {
        menu.put(item, price);
    }
    // method to remove item
    public void removeItem(String item) {
        menu.remove(item);
    }
    
    public void addRating(String item, int rating) {
        ratings.put(item, rating);
    }
    
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (int rating : ratings.values()) {
            sum += rating;
        }
        
        return sum / ratings.size();
    }
    
    public void displayMenu() {
        System.out.println(" Restaurant Menu :");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            String item = entry.getKey();
            double price = entry.getValue();
            System.out.println("The item is " + item + " and the price is Ugshs" + price);
        }
    }



 }


