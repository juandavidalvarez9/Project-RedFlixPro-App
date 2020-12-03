/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.unal.modelos;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    
    @Id
    @Column(name="username")
    private String userName;
    
    @Column(name="nombres")
    String Nombres;

    @Column(name="apellidos")
    String Apellidos;
    
    @Column(name="email")
    String Email;
    
    @Column(name="celular")
    String Celular;
    
    @Column(name="contraseña")
    String Password;
    
    @Column(name="fecha_nacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fechaNacimiento;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "userName=" + userName + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Email=" + Email + ", Celular=" + Celular + ", Password=" + Password + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    
 
}
