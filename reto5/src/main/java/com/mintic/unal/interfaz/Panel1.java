package com.mintic.unal.interfaz;


import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {
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
    final JPasswordField pwcreacion = new JPasswordField();
    final JLabel efechan = new JLabel("Fecha\nNacimiento");
    final JTextField ctfechan = new JTextField();
    final JButton crearButton = new JButton("Crear");

    public Panel1(){
        initcomponents();
    }
    public void initcomponents(){
        setLayout(null);
        eapodo.setBounds(20,20,80,50);
        eapodo.setFont(eapodo.getFont().deriveFont((float) 18));
        eapodo.setHorizontalAlignment(SwingConstants.RIGHT);
        add(eapodo);

        ctapodo.setBounds(120, 20, 400, 50);
        ctapodo.setFont(ctapodo.getFont().deriveFont((float) 18));
        add(ctapodo);

        validarButton.setBounds(540, 20, 100, 50);
        validarButton.setFont(validarButton.getFont().deriveFont((float) 18));
        add(validarButton);

        enombre.setBounds(20,90,80,50);
        enombre.setFont(enombre.getFont().deriveFont((float) 18));
        enombre.setHorizontalAlignment(SwingConstants.RIGHT);
        add(enombre);

        ctnombre.setBounds(120, 90, 400, 50);
        ctnombre.setFont(ctnombre.getFont().deriveFont((float) 18));
        ctnombre.setEnabled(false);
        add(ctnombre);

        eapellido.setBounds(20,160,80,50);
        eapellido.setFont(eapellido.getFont().deriveFont((float) 18));
        eapellido.setHorizontalAlignment(SwingConstants.RIGHT);
        add(eapellido);

        ctapellido.setBounds(120, 160, 400, 50);
        ctapellido.setFont(ctapellido.getFont().deriveFont((float) 18));
        ctapellido.setEnabled(false);
        add(ctapellido);

        email.setBounds(20,230,80,50);
        email.setFont(email.getFont().deriveFont((float) 18));
        email.setHorizontalAlignment(SwingConstants.RIGHT);
        add(email);

        ctmail.setBounds(120, 230, 400, 50);
        ctmail.setFont(ctmail.getFont().deriveFont((float) 18));
        ctmail.setEnabled(false);
        add(ctmail);

        email.setBounds(20,230,80,50);
        email.setFont(email.getFont().deriveFont((float) 18));
        email.setHorizontalAlignment(SwingConstants.RIGHT);
        add(email);

        ctmail.setBounds(120, 230, 400, 50);
        ctmail.setFont(ctmail.getFont().deriveFont((float) 18));
        ctmail.setEnabled(false);
        add(ctmail);


    }
}
