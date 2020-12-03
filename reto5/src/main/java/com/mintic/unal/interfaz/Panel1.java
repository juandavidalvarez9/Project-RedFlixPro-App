
package com.mintic.unal.interfaz;

import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.util.Optional;
import com.mintic.unal.modelos.Usuario;
import com.mintic.unal.repository.UsuarioRepository;
import com.mintic.unal.reto5.Reto5Application;
import com.mintic.unal.reto5.SpringContext;
import org.springframework.beans.factory.annotation.Autowired;

public final class Panel1 extends JPanel {
    

    public Panel1(){
        
       initcomponents();
       

    }
    
    Font labelFont = new Font(Font.MONOSPACED, 0, 20);
    JLabel efondo;
    JLabel eapodo = new JLabel("Apodo");
    JTextField ctapodo = new JTextField();
    JButton validarButton = new JButton("Validar");
    JLabel enombre = new JLabel("Nombre");
    JTextField ctnombre = new JTextField();
    JLabel eapellido = new JLabel("Apellido");
    JTextField ctapellido = new JTextField();
    JLabel email = new JLabel("Email");
    JTextField ctmail = new JTextField();
    JLabel ecelular = new JLabel("Celular");
    JTextField ctcelular = new JTextField();
    JLabel econtraseña = new JLabel("Contraseña");
    JPasswordField pwpassword = new JPasswordField();
    JLabel econfirpassword = new JLabel("<html>Confirmar<br>Contraseña");
    JPasswordField pwconfirpassword = new JPasswordField();
    JLabel efechan = new JLabel("<html>Fecha<br>Nacimiento");
    JTextField ctfechan = new JTextField();
    JButton creareditarButton = new JButton("Crear");
    JButton eliminar = new JButton("Eliminar");
    
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
        
        validarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButtonActionPerformed(evt);
            }
        });
        
        
    }
    
    private void validarButtonActionPerformed(java.awt.event.ActionEvent evt) {         
       
        habilitarCampos();
        if (ctapodo.getText().length()>3) {
           
            ctapodo.setEnabled(true);
            if (consultarUsername()==true) {
                int resp = JOptionPane.showConfirmDialog(null, "¿Desea modificar el Usuario?", "Modificar User", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (resp == 0) {
                    consultarUsername();
                }
            }else{
                int resp = JOptionPane.showConfirmDialog(null, "¿Desea crear el Usuario con ese USERNAME?", "Crear Usuario", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (resp == 0) {
                    
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "El Username debe tener almenos 4 caracteres");
        }
        
        
        /*if(!ctapodo.getText().equals("")){
            buscarPorId();
            tfId.setEnabled(true);
        }
        else{
            lbNotificaciones.setText("No ha digitado ningun id");
        }*/
    } 
    
    public void habilitarCampos() {
        ctnombre.setEnabled(true);
        ctapellido.setEnabled(true);
        ctmail.setEnabled(true);
        ctcelular.setEnabled(true);
        ctfechan.setEnabled(true);
        pwpassword.setEnabled(true);
    }
    
    public void limpiarCamposParaCreacion(){
        ctapodo.setEnabled(false);
        ctnombre.setEnabled(false);
        ctapellido.setText("");
        ctmail.setText("");
        ctcelular.setText("");
        ctfechan.setText("");
    }
    
    public void limpiarCampos(){
        ctapodo.setEnabled(false);
        ctnombre.setEnabled(false);
        ctapellido.setText("");
        ctmail.setText("");
        ctcelular.setText("");
        ctfechan.setText("");
    }
     
    private boolean consultarUsername() {
        boolean verificar = false;
        String username = ctapodo.getText();
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(username);
        if(optionalUsuario.isPresent()){
            Usuario usuario = optionalUsuario.get();
            ctnombre.setText(usuario.getNombres());
            ctapellido.setText(usuario.getApellidos());
            ctmail.setText(usuario.getEmail());
            ctcelular.setText(usuario.getCelular());
            ctfechan.setText(usuario.getFechaNacimiento().toString());
            verificar = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario no existe por favor vuelva a intentar.");
            verificar = false;
        }
        return verificar;
    }
   
    public void eliminar(){
        String username = ctapodo.getText();
        
        try{
            usuarioRepository.deleteById(username);
            JOptionPane.showMessageDialog(null, "El Usuario " + username + " ha sido eliminado exitosamente.");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No puede eliminar un usuario que no existe.");
        }         
    }
    
     private Usuario extraerDatos(){
        Usuario usuario = new Usuario();
        usuario.setNombres(ctnombre.getText());
        usuario.setApellidos(ctapellido.getText());
        usuario.setEmail(ctmail.getText());
        usuario.setCelular(ctcelular.getText());
        //usuario.setFechaNacimiento(ctfechan.getText());
        return usuario;
    }
    
    private void generarUsuario() {
        Usuario usuario = extraerDatos();
   
        String username;
        StringBuffer answer = new StringBuffer();
        if(ctapodo.getText().equals("")){
            username = null;
            answer.append("Usuario creado exitosamente");
        }
        else{
            username = ctapodo.getText();
            answer.append("Usuario redefinido exitosamente");
        }
         
        usuario.setUserName(username);
                
        try{
            usuarioRepository.save(usuario);
            answer.append(usuario.getUserName());
            ctapodo.setText(usuario.getUserName());
            JOptionPane.showMessageDialog(null, answer);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se ha podido guardar el usuario.");
        }
       
    }
    
}
