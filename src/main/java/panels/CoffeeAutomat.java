package panels;

import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;


public class CoffeeAutomat {


    public static void main(String[] args) {

        initUI();
    }

    static void initUI(){

        FlatLightLaf.setup();

        JMenuBar menuBar= new JMenuBar();

        JMenu userMenu= new JMenu("User");
        JMenu coffeeMenu= new JMenu("Coffee");

        JMenuItem addNewUser= new JMenuItem("Add new User");
        JMenuItem deleteUser= new JMenuItem("Delete User");

        JMenuItem addNewCoffee= new JMenuItem("Add new Coffee");
        JMenuItem deleteCoffee= new JMenuItem("Delete Coffee");

        userMenu.add(addNewUser);
        userMenu.add(deleteUser);

        coffeeMenu.add(addNewCoffee);
        coffeeMenu.add(deleteCoffee);

        menuBar.add(userMenu);
        menuBar.add(coffeeMenu);

        JFrame frame = new JFrame("Kaffee Maschine");
        JPanel jPanel = new JPanel();

        JButton jButton1= new JButton("Cappuccino");
        JButton jButton2= new JButton("Filtre Kahve");
        JButton jButton3= new JButton("Türk Kahvesi");

        jPanel.setLayout(new MigLayout("insets 20 0 0 0, align 50% 50%","[500]","[150]"));
        jPanel.add(jButton1, "grow, wrap");
        jPanel.add(jButton2, "grow, wrap");
        jPanel.add(jButton3, "grow, wrap");

        jButton1.addActionListener(e -> new JDialog(frame, "Button Click" ));

        frame.setJMenuBar(menuBar);
        frame.add("Center", jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // give a suitable size to window automatically
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
