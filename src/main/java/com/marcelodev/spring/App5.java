package com.marcelodev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.marcelodev.beans.Jugador;
import com.marcelodev.interfaces.IEquipo;

public class App5 {
  // Uso de interfaces
  // Se crea la clase Jugador
  // Interfaz IEquipo
  // 2 clases que implmentan esa interfaz: Barcelona y Juventus

  public static void main(String[] args) {
    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("com/marcelodev/xml/beans5.xml");

    Jugador j = (Jugador) appContext.getBean("messi");
    System.out.println(j.getNumero());
    System.out.println(j.getNombre());

    IEquipo equipo = (IEquipo) appContext.getBean("barcelona");
    System.out.println(equipo.mostrar());

    ((ConfigurableApplicationContext) appContext).close();

  }
}
