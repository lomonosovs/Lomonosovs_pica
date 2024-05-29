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
    
    public String getAdrese() {
		return adrese;
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
            totalCost += 5; // 5 euro piegāde
        } 
        return totalCost; 
    } 

    public String toString() {
        String rez = "\nvards: " + vards + "\nTelefona numurs: " 
                + tel + "\nPiegade: " + (pegade ? "Ja +5$" : "Ne") +
                "\nAdrese: " + adrese + "\nPizzas:"; 
        for (Pizza pizza : pizzas) { 
            rez += "\n" + pizza.toString(); 
        } 
        rez += "\nTotal Cost: $" + getTotalCost(); 
        return rez; 
    } 
}
