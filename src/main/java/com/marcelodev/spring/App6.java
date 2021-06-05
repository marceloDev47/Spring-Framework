package com.marcelodev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.marcelodev.beans.Jugador;

public class App6 {
  // Uso de Anotaciones @Autowire y @Qualifier

  public static void main(String[] args) {
    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("com/marcelodev/xml/beans6.xml");

    Jugador j = (Jugador) appContext.getBean("messi");
    System.out.println(j.getNumero());
    System.out.println(j.getNombre());
    System.out.println(j.getEquipo().mostrar()); // Probar cambiando el valor colocado en la
                                                 // anotación @Qualifier de la clase Jugador

    // IEquipo equipo = (IEquipo) appContext.getBean("juventus");
    // System.out.println(equipo.mostrar());

    ((ConfigurableApplicationContext) appContext).close();

  }
}
