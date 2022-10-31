import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;


public class KaffeMaschineStartSeite {


    public static void main(String[] args) {

        initUI();
    }

    static void initUI(){

        FlatLightLaf.setup();

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

        frame.add("Center", jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // give a suitable size to window automatically
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
