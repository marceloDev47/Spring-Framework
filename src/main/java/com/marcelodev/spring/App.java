package com.marcelodev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.marcelodev.beans.Animal;
import com.marcelodev.beans.Ciudad;
import com.marcelodev.beans.Mundo;
import com.marcelodev.beans.Persona;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    // Hacer ref al archivo xml de beans
    // Mundo m = new Mundo();
    // m.getSaludo();

    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("com/marcelodev/xml/beans.xml");
    Mundo m = (Mundo) appContext.getBean("mundo"); // o Mundo m = appContext.getBean(Mundo.class);
    System.out.println(m.getSaludo());

    Animal a = (Animal) appContext.getBean("animal");

    System.out.println(a.getId() + " " + a.getTipo() + " " + a.getColor());


    Persona p = (Persona) appContext.getBean("persona");

    // id de la paersona , nombre , pais y ciudad donde vive
    // System.out.println(p.getIdPersona() + " " + p.getNombre() + " " + p.getPais().getNombre() + "
    // "
    // + p.getPais().getCiudad().getNombre());

    String ciudades = " ";
    for (Ciudad ciu : p.getPais().getCiudades()) {
      ciudades += ciu.getNombre() + "-";
    }
    System.out
        .println(p.getIdPersona() + " " + p.getNombre() + " " + p.getPais().getNombre() + ciudades);

    ((ConfigurableApplicationContext) appContext).close(); // se puede cerrar el recurso del
    // application context para quitar la
    // advertencia del IDE

  }
}
