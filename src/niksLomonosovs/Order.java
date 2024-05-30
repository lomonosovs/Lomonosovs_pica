package niksLomonosovs;

import java.util.ArrayList;

public class Order {
    private String vards; 
    private int tel; 
    private boolean pegade; 
    private String adrese; 
    private ArrayList<Pizza> pizzas; 

    public Order(String vards, int tel, boolean pegade) { 
        this.vards = vards; 
        this.tel = tel; 
        this.pegade = pegade; 
        this.pizzas = new ArrayList<>(); 
    } 

    public void setAddress(String adrese) { 
        this.adrese = adrese; 
    } 
    
    public void addPizza(Pizza pizza) { 
        pizzas.add(pizza); 
    } 

    public double getTotalCost() { 
        double totalCost = 0; 
        for (Pizza pizza : pizzas) { 
            totalCost += pizza.getPrice(); 
        } 
        if (pegade) { 
            totalCost += 5;
        } 
        return totalCost; 
    } 

    public String toString() {
        String rez = "\nVards: " + vards + "\nTelefona numurs: " 
                + tel + "\nPiegade: " + (pegade ? "Jā +5$" : "Nē") +
                "\nAdrese: " + adrese + "\nPizzas:"; 
        for (Pizza pizza : pizzas) { 
            rez += "\n" + pizza; 
        } 
        rez += "\nTotal Cost: $" + String.format("%.2f", getTotalCost());
        return rez;
    } 
}
