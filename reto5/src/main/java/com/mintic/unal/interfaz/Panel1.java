package com.mintic.unal.interfaz;


import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Panel1 extends JPanel {
    final Font labelFont = new Font(Font.MONOSPACED, 1, 20);
    private JLabel efondo;
    final JLabel eapodo = new JLabel("Apodo");
    final JTextField ctapodo = new JTextField();
    final JButton validarButton = new JButton("Validar");
    final JLabel enombre = new JLabel("Nombre");
    final JTextField ctnombre = new JTextField();
    final JLabel eapellido = new JLabel("Apellido");
    final JTextField ctapellido = new JTextField();
    final JLabel email = new JLabel("Email");
    final JTextField ctmail = new JTextField();
    final JLabel ecelular = new JLabel("Celular");
    final JTextField ctcelular = new JTextField();
    final JLabel econtraseña = new JLabel("Contraseña");
    final JPasswordField pwpassword = new JPasswordField();
    final JLabel econfirpassword = new JLabel("<html>Confirmar<br>Contraseña");
    final JPasswordField pwconfirpassword = new JPasswordField();
    final JLabel efechan = new JLabel("<html>Fecha<br>Nacimiento");
    final JTextField ctfechan = new JTextField();
    final JButton creareditarButton = new JButton("Crear");
    final JButton eliminar = new JButton("Eliminar");

    public Panel1(){
        initcomponents();
    }
    public void initcomponents(){
        setLayout(null);
        ImageIcon img = new ImageIcon("redflix.jpg");
        efondo = new JLabel("",img,JLabel.CENTER);
        efondo.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        add(efondo);

        eapodo.setBounds(55,183,120,50);
        eapodo.setHorizontalAlignment(SwingConstants.RIGHT);
        eapodo.setForeground(Color.BLACK);
        eapodo.setFont(labelFont);
        efondo.add(eapodo);

        ctapodo.setBounds(190, 183, 400, 50);
        ctapodo.setFont(ctapodo.getFont().deriveFont((float) 18));
        ctapodo.setForeground(Color.BLACK);
        efondo.add(ctapodo);

        validarButton.setBounds(610, 183, 100, 50);
        validarButton.setFont(validarButton.getFont().deriveFont((float) 18));
        efondo.add(validarButton);

        creareditarButton.setBounds(610, 254, 100, 50);
        creareditarButton.setFont(creareditarButton.getFont().deriveFont((float) 18));
        creareditarButton.setEnabled(false);
        efondo.add(creareditarButton);

        enombre.setBounds(55,254,120,50);
        enombre.setHorizontalAlignment(SwingConstants.RIGHT);
        enombre.setFont(labelFont);
        enombre.setForeground(Color.BLACK);
        efondo.add(enombre);

        ctnombre.setBounds(190, 254, 400, 50);
        ctnombre.setFont(ctnombre.getFont().deriveFont((float) 18));
        ctnombre.setEnabled(false);
        ctnombre.setForeground(Color.BLACK);
        efondo.add(ctnombre);

        eapellido.setBounds(55,325,120,50);
        eapellido.setHorizontalAlignment(SwingConstants.RIGHT);
        eapellido.setForeground(Color.BLACK);
        eapellido.setFont(labelFont);
        efondo.add(eapellido);

        ctapellido.setBounds(190, 325, 400, 50);
        ctapellido.setFont(ctapellido.getFont().deriveFont((float) 18));
        ctapellido.setEnabled(false);
        ctapellido.setForeground(Color.BLACK);
        efondo.add(ctapellido);

        email.setBounds(55,396,120,50);
        email.setHorizontalAlignment(SwingConstants.RIGHT);
        email.setForeground(Color.BLACK);
        email.setFont(labelFont);
        efondo.add(email);

        ctmail.setBounds(190, 396, 400, 50);
        ctmail.setFont(ctmail.getFont().deriveFont((float) 18));
        ctmail.setForeground(Color.BLACK);
        ctmail.setEnabled(false);
        efondo.add(ctmail);


        ecelular.setBounds(55,463,120,50);
        ecelular.setHorizontalAlignment(SwingConstants.RIGHT);
        ecelular.setForeground(Color.BLACK);
        ecelular.setFont(labelFont);
        efondo.add(ecelular);

        ctcelular.setBounds(190, 463, 400, 50);
        ctcelular.setFont(ctcelular.getFont().deriveFont((float) 18));
        ctcelular.setForeground(Color.BLACK);
        ctcelular.setEnabled(false);
        efondo.add(ctcelular);

        econtraseña.setBounds(55,534,120,50);
        econtraseña.setHorizontalAlignment(SwingConstants.RIGHT);
        econtraseña.setForeground(Color.BLACK);
        econtraseña.setFont(labelFont);
        efondo.add(econtraseña);

        pwpassword.setBounds(190, 534, 400, 50);
        pwpassword.setFont(pwpassword.getFont().deriveFont((float) 18));
        pwpassword.setForeground(Color.BLACK);
        pwpassword.setEnabled(false);
        efondo.add(pwpassword);

        econfirpassword.setBounds(55,605,120,50);
        econfirpassword.setHorizontalAlignment(SwingConstants.RIGHT);
        econfirpassword.setForeground(Color.BLACK);
        econfirpassword.setFont(labelFont);
        efondo.add(econfirpassword);

        pwconfirpassword.setBounds(190, 605, 400, 50);
        pwconfirpassword.setFont(pwconfirpassword.getFont().deriveFont((float) 18));
        pwconfirpassword.setForeground(Color.BLACK);
        pwconfirpassword.setEnabled(false);
        efondo.add(pwconfirpassword);

        efechan.setBounds(55,675,120,50);
        efechan.setHorizontalAlignment(SwingConstants.RIGHT);
        efechan.setForeground(Color.BLACK);
        efechan.setFont(labelFont);
        efondo.add(efechan);

        ctfechan.setBounds(190, 675, 400, 50);
        ctfechan.setFont(ctfechan.getFont().deriveFont((float) 18));
        ctfechan.setEnabled(false);
        ctfechan.setForeground(Color.BLACK);
        efondo.add(ctfechan);






    }
}
