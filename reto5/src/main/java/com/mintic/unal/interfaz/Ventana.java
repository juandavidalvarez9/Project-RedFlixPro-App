/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.unal.interfaz;
import com.mintic.unal.reto5.Reto5Application;
import java.util.Optional;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Ventana extends JFrame{
    public Ventana() {
        initComponents();
        String [] args = {};
        Reto5Application.runSpringServer(args);
    }

    /**
     * Inicia la creación de las componentes de la ventana de la aplicación
     */
    private void initComponents() {
        // Al cerrar la ventana se finaliza la ejecución del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Establece el titulo de la ventana
        setTitle("Base de Datos Redflix");

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {

            }
        }

        UIManager.put("nimbusBase", new ColorUIResource(Color.BLACK));
        UIManager.put("textForeground", new ColorUIResource(Color.white));

        Tabpanel panelPrincipal = new Tabpanel();
        setContentPane(panelPrincipal);

        pack();
        setSize(765, 880);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);

        // Permite ubicar la ventana en el centro de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);

        // Hace que la ventana de la aplicación sea visible
        setVisible(true);
    }
}
