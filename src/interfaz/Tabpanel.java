package interfaz;

import javax.swing.*;
import java.awt.*;

public class Tabpanel extends JPanel {
    private JTabbedPane tabpanel;
    private Panel1 panel1 = new Panel1();
    private Panel2 panel2 = new Panel2();
    private Panel3 panel3 = new Panel3();
    private JLabel eapodo;
    private JLabel enombre;
    private JTextField ctapodo;
    private JTextField ctnombre;
    private JTextField ctapellido;
    private JTextField ctemail;
    private JTextField ctcelular;
    private JTextField ctfechan;
    private JButton crearButton;
    private JLabel eapellido;
    private JLabel ecelular;
    private JLabel econtraseña;
    private JLabel efechan;
    private JPasswordField pwcreacion;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton validarButton;
    private JButton crearButton1;

    public Tabpanel(){
        initcomponents();
    }
    public void initcomponents(){
        setLayout(new GridLayout(1,1));

        tabpanel = new JTabbedPane();
        tabpanel.setFont(tabpanel.getFont().deriveFont((float) 18));
        add(tabpanel);

        panel1.setName("Usuario");
        tabpanel.add(panel1);

        panel2.setName("Pelicula");
        tabpanel.add(panel2);

        panel3.setName("Serie");
        tabpanel.add(panel3);


    }
}
