package niksLomonosovs;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Lomonosovs_pica {
	public static void main(String[] args) {
        String vards;
        do {
            vards = JOptionPane.showInputDialog("Ievadiet savu vardu:");
        } while (vards.length() < 3);

        int tel;
        do {
            tel = Integer.parseInt(JOptionPane.showInputDialog("Ievadiet savu talruna numuru", "Ievadi bez valsta kodu"));
        } while (tel >= 299999999 || tel < 20000000);

        String[] options = { "Piegade", "No picerijas" };
        int pOpcijas = JOptionPane.showOptionDialog(null, "Vai velaties piegadi vai sanem no picerijas?", "Piegades iespeja",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        boolean pegade = (pOpcijas == 0);

        Order order = new Order(vards, tel, pegade);
        if (pegade) {
            String adrese = JOptionPane.showInputDialog("Ievadiet savu adresi:");
            order.setAddress(adrese);
        }

        boolean pizza1 = true;
        while (pizza1) {
            String[] sizes = { "Maza - $10.00", "Videja - $12.00", "Liela - $15.00" };
            int sizeChoice = JOptionPane.showOptionDialog(null, "Izvēlieties lielumu:", "Lieluma izvēle",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, sizes, sizes[0]);
            String size = sizes[sizeChoice].split(" - ")[0];
            System.out.println(size);

            String[] pizzas = { "Speka", "Pepperoni", "Studenta" };
            int pizzaChoice = JOptionPane.showOptionDialog(null, "Izvēlieties savu picu:", "Picas izvēle",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, pizzas, pizzas[0]);
            Pizza pizza;

            double basePrice = 0;
            switch (sizeChoice) {
                case 0:
                    basePrice = 10;
                    break;
                case 1:
                    basePrice = 12;
                    break;
                case 2:
                    basePrice = 15;
                    break;
            }

            switch (pizzaChoice) {
                case 0:
                    pizza = new Pizza("Speka", 3.90 + basePrice);
                    break;
                case 1:
                    pizza = new Pizza("Pepperoni", 2.99 + basePrice);
                    break;
                case 2:
                    pizza = new Pizza("Studenta", 1.90 + basePrice);
                    break;
                default:
                    pizza = null;
            }
            
            JCheckBox Bbox = new JCheckBox("Bekons +$1.50");
            JCheckBox pBox = new JCheckBox("Dubultais siers +$2.20");
            JCheckBox hBox = new JCheckBox("Skintis +$1.80");
            JCheckBox bbqBox = new JCheckBox("BBQ Sauce +$1.00");
            Object[] piedevas = { "Izveleties piedevas:", Bbox, pBox, hBox, bbqBox };
            int izvelePied = JOptionPane.showConfirmDialog(null, piedevas, "Piedevas", JOptionPane.OK_CANCEL_OPTION);
            
            if (izvelePied == JOptionPane.OK_OPTION) {
                if (Bbox.isSelected()) {
                    pizza.addTopping("Bekons +$1.50");
                }
                if (pBox.isSelected()) {
                    pizza.addTopping("Dubultais siers +$2.20");
                }
                if (hBox.isSelected()) {
                    pizza.addTopping("Skintis +$1.80");
                }
                if (bbqBox.isSelected()) {
                    pizza.addTopping("BBQ Sauce +$1.00");
                }
            }
            System.out.println(izvelePied);
            order.addPizza(pizza);
            int pizzaizvele = JOptionPane.showConfirmDialog(null, "Vai velaties panemt vel vienu picu?", "Izvele",
                    JOptionPane.YES_NO_OPTION);
            if (pizzaizvele == JOptionPane.NO_OPTION) {
                pizza1 = false;
            }
        }
	}
}
