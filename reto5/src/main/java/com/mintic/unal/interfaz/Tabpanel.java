/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.unal.interfaz;


import javax.swing.*;
import java.awt.*;

public class Tabpanel extends JPanel {
    private JTabbedPane tabpanel;
    private Panel1 panel1 = new Panel1();

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
        tabpanel.setBackgroundAt(0,Color.BLACK);
        panel1.setOpaque(true);


    }
}
