package com.mintic.unal.reto5;

import com.mintic.unal.interfaz.Ventana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.mintic.unal.reto5")
public class Reto5Application {

	public static void main(String[] args) {

                new Ventana().setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            SpringApplication.run(Reto5Application.class, args);
        }

}
