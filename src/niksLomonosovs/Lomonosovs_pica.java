package niksLomonosovs;

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

        if (pegade) {
            String adrese = JOptionPane.showInputDialog("Ievadiet savu adresi:");
        }

        boolean pizza1 = true;
        while (pizza1) {
            String[] sizes = { "Maza - $10.00", "Videja - $12.00", "Liela - $15.00" };
            int sizeChoice = JOptionPane.showOptionDialog(null, "Izvēlieties lielumu:", "Lieluma izvēle",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, sizes, sizes[0]);
            String size = sizes[sizeChoice].split(" - ")[0];
            System.out.println(size);


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
        }
	}
}
