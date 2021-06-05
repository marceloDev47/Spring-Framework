package com.marcelodev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.marcelodev.beans.Persona;

public class App4 {

  public static void main(String[] args) {

    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("com/marcelodev/xml/beans4.xml");

    Persona per = (Persona) appContext.getBean("persona");
    Persona per2 = (Persona) appContext.getBean("persona");

    // Descomentar línea para probar instancia nueva cuando el ámbito es Prototype
    per.setIdPersona(5);
    per.setNombre("Jorge");

    System.out.println(per.getIdPersona() + " " + per.getNombre() + " " + per.getPais().getNombre()
        + " " + per.getCiudad().getNombre());
    System.out.println(per2.getIdPersona() + " " + per2.getNombre() + " "
        + per2.getPais().getNombre() + " " + per2.getCiudad().getNombre());

    System.out.println(per);
    System.out.println(per2);

    // Singleton - tendrán mismo ID del objeto - misma instancia
    // Prototype - tendrán instancias diferentes


    ((ConfigurableApplicationContext) appContext).close();
  }

}
