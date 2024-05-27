package niksLomonosovs;

public class Pizza {
	private String vards; 
    private double price; 

    public Pizza(String vards, double price) { 
        this.vards = vards; 
        this.price = price; 
    } 

    public void addTopping(String topping){ 
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
}
