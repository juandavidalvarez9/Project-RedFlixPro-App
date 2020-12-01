package interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{

    public Ventana() {
        initComponents();
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

        // Crea un panel que sirve de lienzo para el dibujo de la ciudad
        Tabpanel panelPrincipal = new Tabpanel();
        // Sirve de panel principal de la ventana
        setContentPane(panelPrincipal);
        // Adiciona el panel de controles al panel principal

        // Adjusta el tamaño de la ventana para que quepan todos los componentes
        pack();
        setSize(700, 800);

        // Permite ubicar la ventana en el centro de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);

        // Hace que la ventana de la aplicación sea visible
        setVisible(true);
    }
}
