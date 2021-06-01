package com.marcelodev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.marcelodev.beans.Jugador2;

public class App7 {
  // Uso de Estereoripos @Component, @Service, @Repository, @Controller

  public static void main(String[] args) {
    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("com/marcelodev/xml/beans7.xml");

    // Jugador2 j = (Jugador2) appContext.getBean("jugador2");
    Jugador2 j = (Jugador2) appContext.getBean("messi");
    System.out.println(j.getNumero());
    System.out.println(j.getNombre());
    System.out.println(j.getEquipo().mostrar());

    // IEquipo equipo = (IEquipo) appContext.getBean("juventus");
    // System.out.println(equipo.mostrar());

    ((ConfigurableApplicationContext) appContext).close();

  }
}
