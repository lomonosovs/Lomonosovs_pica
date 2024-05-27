package niksLomonosovs;

import java.util.ArrayList;

public class Pizza {
    private String vards; 
    private double price; 
    private ArrayList<String> piedevas; 

    public Pizza(String vards, double price) { 
        this.vards = vards; 
        this.price = price; 
        this.piedevas = new ArrayList<>();
    } 

    public void addTopping(String topping){ 
        piedevas.add(topping); 
        switch (topping) {
            case "Bekons +$1.50":
                price += 1.50;
                break;
            case "Dubultais siers +$2.20":
                price += 2.20;
                break;
            case "Skintis +$1.80":
                price += 1.80;
                break;
            case "BBQ Sauce +$1.00":
                price += 1.00;
                break;
            default:
                break;
        }
    } 

    public double getPrice() { 
        return price; 
    } 

    public String toString() { 
        String rez = vards + " - $" + price; 
        if (!piedevas.isEmpty()) { 
            rez += "\npiedevas:"; 
            for (String topping : piedevas) { 
                rez += "\n" + topping; 
            } 
        } 
        return rez; 
    } 
}
