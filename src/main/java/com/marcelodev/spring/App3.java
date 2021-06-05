package com.marcelodev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.marcelodev.beans.Persona;

public class App3 {

  public static void main(String[] args) {
    // Uso de Autowired para beans por config xml
    ApplicationContext appContext =
        new ClassPathXmlApplicationContext("com/marcelodev/xml/beans3.xml");

    Persona p = (Persona) appContext.getBean("persona");

    System.out
        .println(p.getNombre() + " " + p.getPais().getNombre() + " " + p.getCiudad().getNombre());

    ((ConfigurableApplicationContext) appContext).close();
  }

}
